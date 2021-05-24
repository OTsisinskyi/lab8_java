package ua.lviv.iot.camping.dal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.camping.models.Tent;


@Repository
public interface TentRepository extends JpaRepository<Tent, Integer> {

}
