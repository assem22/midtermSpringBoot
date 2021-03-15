package kz.iitu.midtermSpringProject.service;

import kz.iitu.midtermSpringProject.entity.Subscriber;

import java.util.List;

public interface SubscriberService {
    List<Subscriber> findAllPublishers();

    Subscriber findPublisherById(Long id);

    void createPublisher(Subscriber subscriber);

    void updatePublisher(Subscriber subscriber);

    void deletePublisher(Long id);
}
