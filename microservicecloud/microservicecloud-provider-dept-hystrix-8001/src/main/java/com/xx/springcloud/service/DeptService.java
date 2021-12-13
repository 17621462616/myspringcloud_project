package com.xx.springcloud.service;
 
import java.util.List;
 
import com.xx.springcloud.entities.Dept;
 
public interface DeptService
{
  public boolean add(Dept dept);
  public Dept    get(Long id);
  public List<Dept> list();
}
 
