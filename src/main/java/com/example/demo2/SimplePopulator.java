package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SimplePopulator {
    @Autowired
    private MessageAgeRepository messageAgeRepository;

    @Autowired
    private DeleteFrequencyRepository deleteFrequencyRepository;

    @Autowired
    private SettingsRepository settingsRepository;

    @PostConstruct
    public void postConstruct() {
        MessageAge messageAge = new MessageAge();
        messageAge.setValue(11);

        messageAgeRepository.save(messageAge);

        DeleteFrequency deleteFrequency = new DeleteFrequency();
        deleteFrequency.setValue(20);

        deleteFrequencyRepository.save(deleteFrequency);

        deleteFrequencyRepository.deleteAll();

        List all = settingsRepository.findAll();
        List<MessageAge> messageAges = messageAgeRepository.findAll();
        List<DeleteFrequency> deleteFrequencies = deleteFrequencyRepository.findAll();

        System.out.println();
    }
}
