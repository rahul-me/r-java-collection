package com.rpc.$g_hashset;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Student {
    String name;
    int rollNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name.trim().toLowerCase(), student.name.trim().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.trim().toLowerCase(), rollNo);
    }
}
