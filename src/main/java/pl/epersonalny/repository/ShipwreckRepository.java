package pl.epersonalny.repository;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.epersonalny.model.Shipwreck;

import java.util.List;
import java.util.Optional;


public class ShipwreckRepository implements JpaRepository<Shipwreck, Long> {


    @Override
    public List<Shipwreck> findAll() {
        return null;
    }

    @Override
    public List<Shipwreck> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Shipwreck> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Shipwreck> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Shipwreck shipwreck) {

    }

    @Override
    public void deleteAll(Iterable<? extends Shipwreck> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Shipwreck> S save(S s) {
        return null;
    }

    @Override
    public <S extends Shipwreck> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Shipwreck> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Shipwreck> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Shipwreck> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Shipwreck getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Shipwreck> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Shipwreck> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Shipwreck> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Shipwreck> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Shipwreck> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Shipwreck> boolean exists(Example<S> example) {
        return false;
    }
}
