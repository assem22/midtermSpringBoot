package kz.iitu.midtermSpringProject.repository;

import kz.iitu.midtermSpringProject.entity.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
}
