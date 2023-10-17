package miproyecto.core.driver_ports;

import miproyecto.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
