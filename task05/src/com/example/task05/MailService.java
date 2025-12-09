package com.example.task05;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mail<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<>();

    @Override
    public void accept(Mail<T> mail) {
        mailBox.computeIfAbsent(mail.getTo(), k -> new ArrayList<>()).add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return new AbstractMap<String, List<T>>() {
            @Override
            public Set<Entry<String, List<T>>> entrySet() {
                return Collections.emptySet();
            }

            @Override
            public List<T> get(Object key) {
                List<T> result = mailBox.get(key);
                return result != null ? result : Collections.emptyList();
            }
        };
    }
}