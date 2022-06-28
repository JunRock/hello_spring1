package Hello.hello_spring1;

import Hello.hello_spring1.repository.MemberRepository;
import Hello.hello_spring1.repository.MemoryMemberRepository;
import Hello.hello_spring1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository() );
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
