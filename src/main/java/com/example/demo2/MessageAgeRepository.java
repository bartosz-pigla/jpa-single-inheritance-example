package com.example.demo2;

import javax.transaction.Transactional;

@Transactional
public interface MessageAgeRepository extends SettingsRepository<MessageAge> {
}
