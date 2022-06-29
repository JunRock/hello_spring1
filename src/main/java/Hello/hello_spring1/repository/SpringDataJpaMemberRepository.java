package Hello.hello_spring1.repository;


import Hello.hello_spring1.repository.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,MemberRepository{
    @Override
    Optional<Member> findByName(String name);

}
