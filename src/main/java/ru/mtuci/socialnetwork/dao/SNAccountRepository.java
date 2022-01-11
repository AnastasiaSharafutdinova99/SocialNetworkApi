package ru.mtuci.socialnetwork.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtuci.socialnetwork.model.SNAccount;

@Transactional(readOnly = true)
public interface SNAccountRepository extends JpaRepository<SNAccount, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM SNAccount p WHERE p.id=:id")
    int delete(@Param("id") Long id);
}
