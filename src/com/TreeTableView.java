package com;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;

/**
 * Created by ser12 on 04.12.16.
 */
public class TreeTableView extends Panel implements View {


    private final VerticalLayout root;
    public TreeTableView() {
        root=new VerticalLayout();
        root.setSizeFull();
        root.setMargin(true);


        root.addComponent(buildTreeTable());


        setSizeFull();
    }

    private Component buildTreeTable(){
        TreeTable treeTable = new TreeTable();
        treeTable.setSizeFull();
        treeTable.addContainerProperty("Name", String.class, null);
        treeTable.addContainerProperty("Number", Integer.class, null);
        treeTable.addItem(new Object[]{"Menu", null}, 0);
        treeTable.addItem(new Object[]{"Beverages", null}, 1);
        treeTable.setParent(1, 0);
        treeTable.addItem(new Object[]{"Foods", null}, 2);
        treeTable.setParent(2, 0);
        treeTable.addItem(new Object[]{"Coffee", 23}, 3);
        treeTable.addItem(new Object[]{"Tea", 42}, 4);
        treeTable.setParent(3, 1);
        treeTable.setParent(4, 1);
        treeTable.addItem(new Object[]{"Bread", 13}, 5);
        treeTable.addItem(new Object[]{"Cake", 11}, 6);
        treeTable.setParent(5, 2);
        treeTable.setParent(6, 2);
        return treeTable;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

    }
}
