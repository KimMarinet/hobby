package org.marinet.sevenNights.Service;

import lombok.RequiredArgsConstructor;
import org.marinet.sevenNights.entities.StatusVO;

import java.util.Scanner;

@RequiredArgsConstructor
public class SaveService {
    private final StatusVO status;

    public StatusVO setData(){

        Scanner sc = new Scanner(System.in);
        System.out.println("***************** 정보 입력 *********************");
        System.out.print("캐릭터 공격력 스테이터스를 입력하세요 : ");
        int attackPower = sc.nextInt();
        System.out.println();
        System.out.print("펫의 공격력 스테이터스를 입력하세요 : ");
        int petPower = sc.nextInt();

        status.setAttackPower(attackPower);
        status.setPetPower(petPower);

        System.out.println(status);

        return status;
    }
}
