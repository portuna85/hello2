package com.example.hello.servlet.domain.member;

import com.example.hello.servlet.domain.Member;
import com.example.hello.servlet.domain.MemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save(){
        // given
        Member member = new Member("JSBAE", 24);

        // when
        Member save = memberRepository.save(member);

        // then
        Member byId = memberRepository.findById(save.getId());
        assertThat(byId).isEqualTo(save);
    }

    @Test
    void findAll() {
        // given
        Member memberA = new Member("memberA", 65);
        Member memberB = new Member("memberB", 44);
        memberRepository.save(memberA);
        memberRepository.save(memberB);

        // when
        List<Member> list = memberRepository.findAll();

        // then
        assertThat(list.size()).isEqualTo(2);
        assertThat(list).contains(memberA, memberB);
    }
}