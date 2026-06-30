/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopeasedataprocessingapplication1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Elisha
 */
public class DuplicateRemover implements IDuplicateRemover {

    @Override
    public List<Record> removeDuplicates(List<Record> records) {
        List<Record> unique = new ArrayList<>();
        Set<String> seenIds = new HashSet<>();

        for (Record r : records) {
            if (!seenIds.contains(r.getTransactionId())) {
                seenIds.add(r.getTransactionId());
                unique.add(r);
            }
        }

        System.out.println("Duplicate Removal Completed");
        return unique;
    }
}