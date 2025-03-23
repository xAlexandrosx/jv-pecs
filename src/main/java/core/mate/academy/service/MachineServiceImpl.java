package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

  @Override
  public List<T> getAll(Class<? extends Machine> type) {
    List<T> machines = new ArrayList<>();
    if (type.equals(Bulldozer.class)) {
      machines.add((T) new Bulldozer());
    } else if (type.equals(Truck.class)) {
      machines.add((T) new Truck());
    } else if (type.equals(Excavator.class)) {
      machines.add((T) new Excavator());
    }
    return machines;
  }

  @Override
  public void fill(List<? super T> machines, T value) {
    for (int i = 0; i < machines.size(); i++) {
      machines.set(i, value);
    }
  }

  @Override
  public void startWorking(List<? extends Machine> machines) {
    for (Machine machine : machines) {
      machine.doWork();
    }
  }
}
