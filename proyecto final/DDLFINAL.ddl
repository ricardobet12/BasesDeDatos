-- Generado por Oracle SQL Developer Data Modeler 18.1.0.082.1035
--   en:        2018-06-05 19:43:29 COT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE actividades (
    idactividades         NUMBER NOT NULL,
    programa_idprograma   NUMBER NOT NULL,
    actividad             VARCHAR2(50)
);

COMMENT ON TABLE actividades IS
    'ESTA RELACIONADA CON PROGRAMA';

COMMENT ON COLUMN actividades.idactividades IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN actividades.programa_idprograma IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN actividades.actividad IS
    'RECIBE TODOS LOS CARACTERES';

ALTER TABLE actividades ADD CONSTRAINT actividades_pk PRIMARY KEY ( idactividades );

CREATE TABLE asignatura (
    idasignatura               NUMBER NOT NULL,
    programa_idprograma        NUMBER NOT NULL,
    estudiante_estudiante_id   NUMBER NOT NULL,
    cancelarasignatura         VARCHAR2(20),
    matriculav1_ese_id         NUMBER NOT NULL,
    matriculav1__id            NUMBER NOT NULL,
    asignaturas                VARCHAR2(20)
);

COMMENT ON TABLE asignatura IS
    'ENTIDAD DONDE ESTAN LAS ASIGNATURAS QUE TIENE LOS ESTUDIANTES';

COMMENT ON COLUMN asignatura.idasignatura IS
    'recibe los numeros del 0 al 9';

COMMENT ON COLUMN asignatura.programa_idprograma IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN asignatura.estudiante_estudiante_id IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN asignatura.cancelarasignatura IS
    'RECIBE TODOS LOS CARACTERES';

COMMENT ON COLUMN asignatura.matriculav1_ese_id IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN asignatura.matriculav1__id IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN asignatura.asignaturas IS
    'recibe todos los caracteres';

ALTER TABLE asignatura ADD CONSTRAINT asignatura_pk PRIMARY KEY ( idasignatura );

CREATE TABLE calendarioaca (
    idactividad   NUMBER NOT NULL,
    anio          VARCHAR2(10)
);

COMMENT ON TABLE calendarioaca IS
    'PARA INGRESAR EL AÑO DEL CALENDARIO ACADEMICO';

COMMENT ON COLUMN calendarioaca.idactividad IS
    'identificador de la actividad';

COMMENT ON COLUMN calendarioaca.anio IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

ALTER TABLE calendarioaca ADD CONSTRAINT calendarioacademico_pk PRIMARY KEY ( idactividad );

CREATE TABLE departamento (
    iddepartamento        NUMBER NOT NULL,
    director_iddirector   NUMBER NOT NULL,
    departamento          VARCHAR2(20)
);

COMMENT ON TABLE departamento IS
    'ESTA RELACIONADO CON DIRECTOR PROGRAMA Y DOCENTE DEPARTAMENTO';

COMMENT ON COLUMN departamento.iddepartamento IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN departamento.director_iddirector IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN departamento.departamento IS
    'RECIBE TODOS LOS CARACTERES';

ALTER TABLE departamento ADD CONSTRAINT departamento_pk PRIMARY KEY ( iddepartamento );

CREATE TABLE director (
    iddirector          NUMBER NOT NULL,
    persona_idpersona   NUMBER NOT NULL
);

COMMENT ON TABLE director IS
    'DATOS DEL DIRECTOR PARA AUTORIZAR ';

COMMENT ON COLUMN director.iddirector IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN director.persona_idpersona IS
    'RECIBE NUMEROS DEL 0 AL 9';

ALTER TABLE director ADD CONSTRAINT director_pk PRIMARY KEY ( iddirector );

CREATE TABLE docente (
    iddocente           NUMBER NOT NULL,
    persona_idpersona   NUMBER NOT NULL
);

COMMENT ON TABLE docente IS
    'ESTA RELACIONADO CON EVALUACION PERSONA Y DOCENTE DEPARTAMENTO';

COMMENT ON COLUMN docente.iddocente IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN docente.persona_idpersona IS
    'RECIBE NUMETOS DEL 0 AL 9';

ALTER TABLE docente ADD CONSTRAINT docente_pk PRIMARY KEY ( iddocente );

CREATE TABLE docente_departamento (
    iddecdoc                  NUMBER NOT NULL,
    docente_iddocente         NUMBER NOT NULL,
    asignatura_idasignatura   NUMBER NOT NULL
);

COMMENT ON TABLE docente_departamento IS
    'ESTA RELACIONADA CON ASIGNATURA DOCENTE Y DEPARTAMENTO';

COMMENT ON COLUMN docente_departamento.iddecdoc IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN docente_departamento.docente_iddocente IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN docente_departamento.asignatura_idasignatura IS
    'RECIBE NUMETOS DEL 0 AL 9';

CREATE TABLE evaluacion (
    idevaluacion                   NUMBER NOT NULL,
    docente_iddocente              NUMBER NOT NULL,
    notas                          NUMBER NOT NULL,
    grupos_grupos_id               NUMBER NOT NULL,
    matriculav1_estudiante_id      NUMBER NOT NULL,
    matriculav1_grupos_grupos_id   NUMBER NOT NULL
);

COMMENT ON TABLE evaluacion IS
    'ESTA RELACIONADA CON GRUPOS MATRICULA Y DOCENTES';

COMMENT ON COLUMN evaluacion.idevaluacion IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN evaluacion.docente_iddocente IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN evaluacion.notas IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN evaluacion.grupos_grupos_id IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN evaluacion.matriculav1_estudiante_id IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN evaluacion.matriculav1_grupos_grupos_id IS
    'RECIBE LOS NUMEROS DEL 0 AL 9';

ALTER TABLE evaluacion ADD CONSTRAINT evaluacion_pk PRIMARY KEY ( idevaluacion );

CREATE TABLE franja (
    idfranja      NUMBER NOT NULL,
    horainicial   DATE,
    horafinal     DATE
);

COMMENT ON COLUMN franja.idfranja IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN franja.horainicial IS
    'HORA DEPENDIENDO DE LA ZONA HORARIA';

COMMENT ON COLUMN franja.horafinal IS
    'HORA DEPENDIENDO DE LA ZONA HORARIA';

ALTER TABLE franja ADD CONSTRAINT franja_pk PRIMARY KEY ( idfranja );

CREATE TABLE franja_horario (
    idfranah                  NUMBER NOT NULL,
    horario_idhorario         NUMBER NOT NULL,
    franja_idfranja           NUMBER NOT NULL,
    grupos_grupos_id          NUMBER NOT NULL,
    asignatura_idasignatura   NUMBER NOT NULL
);

COMMENT ON TABLE franja_horario IS
    'EN ESTA ENTIDAD PODEMOS DEFINIR LAS FRANJAS CON LOS HORARIOS';

COMMENT ON COLUMN franja_horario.idfranah IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN franja_horario.horario_idhorario IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN franja_horario.franja_idfranja IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN franja_horario.grupos_grupos_id IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN franja_horario.asignatura_idasignatura IS
    'RECIBE NUMEROS DEL 0 AL 9';

ALTER TABLE franja_horario ADD CONSTRAINT franja_horario_pk PRIMARY KEY ( idfranah );

CREATE TABLE grupos (
    grupos_id                 NUMBER NOT NULL,
    idgrupos                  NUMBER,
    periodoaca_idperiodoaca   NUMBER NOT NULL,
    grupo                     VARCHAR2(20),
    matriculav1_id            NUMBER NOT NULL,
    matriculav1_grupos_id     NUMBER NOT NULL
);

COMMENT ON TABLE grupos IS
    'ENTIDAD PARA LA CREACION DE GRUPOS';

COMMENT ON COLUMN grupos.grupos_id IS
    'recibe todos los numeros del 0 al 9.';

COMMENT ON COLUMN grupos.idgrupos IS
    'recibe todos los numeros del 0 al 9.';

COMMENT ON COLUMN grupos.periodoaca_idperiodoaca IS
    'recibe todos los numeros del 0 al 9.';

COMMENT ON COLUMN grupos.grupo IS
    'TODOS LOS CARACTERES';

COMMENT ON COLUMN grupos.matriculav1_id IS
    'recibe todos los numeros del 0 al 9.';

COMMENT ON COLUMN grupos.matriculav1_grupos_id IS
    'recibe todos los numeros del 0 al 9.';

ALTER TABLE grupos ADD CONSTRAINT grupos_pk PRIMARY KEY ( grupos_id );

CREATE TABLE horario (
    idhorario   NUMBER NOT NULL,
    dia         VARCHAR2(20)
);

COMMENT ON TABLE horario IS
    'PARA ASIGNAR LA FRANJA';

COMMENT ON COLUMN horario.dia IS
    'TODOS LOS CARACTERES';

ALTER TABLE horario ADD CONSTRAINT horario_pk PRIMARY KEY ( idhorario );

CREATE TABLE matriculasemestral (
    idmatriculasemestras       NUMBER NOT NULL,
    semestre_idsemestre        NUMBER NOT NULL,
    periodoaca_idperiodoaca    NUMBER NOT NULL,
    estudiante_estudiante_id   NUMBER NOT NULL,
    cancelarsemestre           VARCHAR2(20)
);

COMMENT ON TABLE matriculasemestral IS
    'PARA DEFINIR EL SEMESTRE DE LA MATRICULA';

COMMENT ON COLUMN matriculasemestral.idmatriculasemestras IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN matriculasemestral.semestre_idsemestre IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN matriculasemestral.periodoaca_idperiodoaca IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN matriculasemestral.estudiante_estudiante_id IS
    'NUMEROS DEL 0 AL 9';

ALTER TABLE matriculasemestral ADD CONSTRAINT promedio_pk PRIMARY KEY ( idmatriculasemestras );

CREATE TABLE matriculav1 (
    idmatricula                  NUMBER NOT NULL,
    grupos_grupos_id             NUMBER NOT NULL,
    periodoaca_idperiodoaca      NUMBER NOT NULL,
    matsemestral_idmasemestras   NUMBER NOT NULL,
    persona_idpersona            NUMBER NOT NULL,
    programa_idprograma          NUMBER NOT NULL
);

COMMENT ON TABLE matriculav1 IS
    'MUCHOS ESTUDIANTES PUEDEN PERTENECER A MUCHOS QUE ES LA MATRICULA';

COMMENT ON COLUMN matriculav1.idmatricula IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN matriculav1.grupos_grupos_id IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN matriculav1.periodoaca_idperiodoaca IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN matriculav1.matsemestral_idmasemestras IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN matriculav1.persona_idpersona IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN matriculav1.programa_idprograma IS
    'RECIBE NUMETOS DEL 0 AL 9';

ALTER TABLE matriculav1 ADD CONSTRAINT matriculav1_pk PRIMARY KEY ( idmatricula,
                                                                    grupos_grupos_id );

CREATE TABLE periodoacademico (
    idperiodoacademico          NUMBER NOT NULL,
    periodo                     NUMBER,
    calendarioaca_idactividad   NUMBER NOT NULL
);

COMMENT ON COLUMN periodoacademico.idperiodoacademico IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN periodoacademico.periodo IS
    'NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN periodoacademico.calendarioaca_idactividad IS
    'NUMEROS DEL 0 AL 9';

ALTER TABLE periodoacademico ADD CONSTRAINT periodoacademico_pk PRIMARY KEY ( idperiodoacademico );

CREATE TABLE persona (
    idpersona         NUMBER NOT NULL,
    cedula            NUMBER,
    primernombre      VARCHAR2(20),
    segundonombre     VARCHAR2(20),
    primerapellido    VARCHAR2(30),
    segundoapellido   VARCHAR2(30),
    correo            VARCHAR2(30),
    celular           NUMBER,
    edad              NUMBER,
    direccion         VARCHAR2(40)
);

COMMENT ON TABLE persona IS
    'ENTA ENTIDAD ESTA RELACIONADA CON DOCENTE MATRICULA Y DIRECTOR';

COMMENT ON COLUMN persona.idpersona IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN persona.cedula IS
    'recibe todos los numeros';

COMMENT ON COLUMN persona.primernombre IS
    'recibe todos los caracteres';

COMMENT ON COLUMN persona.segundonombre IS
    'todos los caracteres';

COMMENT ON COLUMN persona.primerapellido IS
    'todos los caracteres';

COMMENT ON COLUMN persona.segundoapellido IS
    'todos los caracteres';

COMMENT ON COLUMN persona.correo IS
    'todos los caracteres';

COMMENT ON COLUMN persona.celular IS
    'los numeros del 0 al 9';

COMMENT ON COLUMN persona.edad IS
    'recibe numeros del 0 al 9';

COMMENT ON COLUMN persona.direccion IS
    'todos los caracteres';

ALTER TABLE persona ADD CONSTRAINT persona_pk PRIMARY KEY ( idpersona );

CREATE TABLE plandeestudios_asignaruta (
    planestudios_idplanestudios   NUMBER NOT NULL,
    asignatura_idasignatura       NUMBER NOT NULL
);

COMMENT ON TABLE plandeestudios_asignaruta IS
    'TABLA INTERMEDIA ENTRE PLAN DE ESTUDIOS Y ASIGNATURAS';

COMMENT ON COLUMN plandeestudios_asignaruta.planestudios_idplanestudios IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN plandeestudios_asignaruta.asignatura_idasignatura IS
    'RECIBE NUMEROS DEL 0 AL 9';

ALTER TABLE plandeestudios_asignaruta ADD CONSTRAINT plandeestudios_asignaruta_pk PRIMARY KEY ( planestudios_idplanestudios,
                                                                                                asignatura_idasignatura );

CREATE TABLE planestudios (
    idplanestudios        NUMBER NOT NULL,
    programa_idprograma   NUMBER NOT NULL
);

COMMENT ON TABLE planestudios IS
    'ESTA RELACIONADA CON PROGRAMAS REQUISITOS Y SIMULTANEIDAD';

COMMENT ON COLUMN planestudios.idplanestudios IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN planestudios.programa_idprograma IS
    'RECIBE NUMEROS DEL 0 AL 9';

ALTER TABLE planestudios ADD CONSTRAINT planestudios_pk PRIMARY KEY ( idplanestudios );

CREATE TABLE programa (
    idprograma     NUMBER NOT NULL,
    departamento   NUMBER NOT NULL,
    programa       VARCHAR2(30)
);

COMMENT ON TABLE programa IS
    'ESTA RELACIONADA CON DEPARTAMENTO ACTIVIDADES PLAN DE ESTUDIOS Y ASIGNATURA';

COMMENT ON COLUMN programa.idprograma IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN programa.departamento IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN programa.programa IS
    'RECIBE TODOS LOS CARACTERES';

ALTER TABLE programa ADD CONSTRAINT programa_pk PRIMARY KEY ( idprograma );

CREATE TABLE requisitos (
    idrequisitos                  NUMBER NOT NULL,
    planestudios_idplanestudios   NUMBER NOT NULL,
    asignatura_idasignatura       NUMBER NOT NULL,
    asignatura_idasignatura1      NUMBER NOT NULL
);

COMMENT ON TABLE requisitos IS
    'ESTA RELACIONADA CON PLAN DE ESTUDIOS Y ASIGNATURA';

COMMENT ON COLUMN requisitos.idrequisitos IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN requisitos.planestudios_idplanestudios IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN requisitos.asignatura_idasignatura IS
    'RECIBE NUMETOS DEL 0 AL 9';

COMMENT ON COLUMN requisitos.asignatura_idasignatura1 IS
    'RECIBE NUMETOS DEL 0 AL 9';

ALTER TABLE requisitos ADD CONSTRAINT requisitos_pk PRIMARY KEY ( idrequisitos );

CREATE TABLE simultaneidad (
    idsumultaneidad               NUMBER NOT NULL,
    planestudios_idplanestudios   NUMBER NOT NULL,
    asignatura_idasignatura1      NUMBER NOT NULL,
    asignatura_idasignatura       NUMBER NOT NULL
);

COMMENT ON TABLE simultaneidad IS
    'ESTA RELACIONADAO CON PLAN DE ESTUDIOS Y ASIGNATURAS';

COMMENT ON COLUMN simultaneidad.idsumultaneidad IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN simultaneidad.planestudios_idplanestudios IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN simultaneidad.asignatura_idasignatura1 IS
    'RECIBE NUMEROS DEL 0 AL 9';

COMMENT ON COLUMN simultaneidad.asignatura_idasignatura IS
    'RECIBE NUMEROS DEL 0 AL 9';

ALTER TABLE simultaneidad ADD CONSTRAINT simultaneidad_pk PRIMARY KEY ( idsumultaneidad );

ALTER TABLE actividades
    ADD CONSTRAINT actividades_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE asignatura
    ADD CONSTRAINT asignatura_matriculav1_fk FOREIGN KEY ( matriculav1_ese_id,
                                                           matriculav1__id )
        REFERENCES matriculav1 ( idmatricula,
                                 grupos_grupos_id );

ALTER TABLE departamento
    ADD CONSTRAINT departamento_director_fk FOREIGN KEY ( director_iddirector )
        REFERENCES director ( iddirector );

ALTER TABLE director
    ADD CONSTRAINT director_persona_fk FOREIGN KEY ( persona_idpersona )
        REFERENCES persona ( idpersona );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE docente_departamento
    ADD CONSTRAINT docente_departamento_asignatura_fk FOREIGN KEY ( asignatura_idasignatura )
        REFERENCES asignatura ( idasignatura );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE docente_departamento
    ADD CONSTRAINT docente_departamento_departamento_fk FOREIGN KEY ( iddecdoc )
        REFERENCES departamento ( iddepartamento );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE docente_departamento
    ADD CONSTRAINT docente_departamento_docente_fk FOREIGN KEY ( docente_iddocente )
        REFERENCES docente ( iddocente );

ALTER TABLE docente
    ADD CONSTRAINT docente_persona_fk FOREIGN KEY ( persona_idpersona )
        REFERENCES persona ( idpersona );

ALTER TABLE evaluacion
    ADD CONSTRAINT evaluacion_docente_fk FOREIGN KEY ( docente_iddocente )
        REFERENCES docente ( iddocente );

ALTER TABLE evaluacion
    ADD CONSTRAINT evaluacion_grupos_fk FOREIGN KEY ( grupos_grupos_id )
        REFERENCES grupos ( grupos_id );

ALTER TABLE evaluacion
    ADD CONSTRAINT evaluacion_matriculav1_fk FOREIGN KEY ( matriculav1_estudiante_id,
                                                           matriculav1_grupos_grupos_id )
        REFERENCES matriculav1 ( idmatricula,
                                 grupos_grupos_id );

ALTER TABLE franja_horario
    ADD CONSTRAINT franja_horario_franja_fk FOREIGN KEY ( franja_idfranja )
        REFERENCES franja ( idfranja );

ALTER TABLE franja_horario
    ADD CONSTRAINT franja_horario_grupos_fk FOREIGN KEY ( grupos_grupos_id )
        REFERENCES grupos ( grupos_id );

ALTER TABLE franja_horario
    ADD CONSTRAINT franja_horario_horario_fk FOREIGN KEY ( horario_idhorario )
        REFERENCES horario ( idhorario );

ALTER TABLE franja_horario
    ADD CONSTRAINT franjafk FOREIGN KEY ( asignatura_idasignatura )
        REFERENCES asignatura ( idasignatura );

ALTER TABLE grupos
    ADD CONSTRAINT grupos_matriculav1_fk FOREIGN KEY ( matriculav1_id,
                                                       matriculav1_grupos_id )
        REFERENCES matriculav1 ( idmatricula,
                                 grupos_grupos_id );

ALTER TABLE grupos
    ADD CONSTRAINT grupos_periodoacademico_fk FOREIGN KEY ( periodoaca_idperiodoaca )
        REFERENCES periodoacademico ( idperiodoacademico );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE matriculav1
    ADD CONSTRAINT matriculav1_matriculasemestral_fk FOREIGN KEY ( matsemestral_idmasemestras )
        REFERENCES matriculasemestral ( idmatriculasemestras );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE matriculav1
    ADD CONSTRAINT matriculav1_periodoacademico_fk FOREIGN KEY ( periodoaca_idperiodoaca )
        REFERENCES periodoacademico ( idperiodoacademico );

ALTER TABLE matriculav1
    ADD CONSTRAINT matriculav1_persona_fk FOREIGN KEY ( persona_idpersona )
        REFERENCES persona ( idpersona );

ALTER TABLE matriculav1
    ADD CONSTRAINT matriculav1_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE periodoacademico
    ADD CONSTRAINT periodoacademico_ FOREIGN KEY ( calendarioaca_idactividad )
        REFERENCES calendarioaca ( idactividad );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE plandeestudios_asignaruta
    ADD CONSTRAINT plandeestudios_asignaruta_asignatura_fk FOREIGN KEY ( asignatura_idasignatura )
        REFERENCES asignatura ( idasignatura );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE plandeestudios_asignaruta
    ADD CONSTRAINT plandeestudios_asignaruta_planestudios_fk FOREIGN KEY ( planestudios_idplanestudios )
        REFERENCES planestudios ( idplanestudios );

ALTER TABLE planestudios
    ADD CONSTRAINT planestudios_programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE programa
    ADD CONSTRAINT programa_departamento_fk FOREIGN KEY ( departamento )
        REFERENCES departamento ( iddepartamento );

ALTER TABLE asignatura
    ADD CONSTRAINT programa_fk FOREIGN KEY ( programa_idprograma )
        REFERENCES programa ( idprograma );

ALTER TABLE matriculasemestral
    ADD CONSTRAINT promedio_periodoacademico_fk FOREIGN KEY ( periodoaca_idperiodoaca )
        REFERENCES periodoacademico ( idperiodoacademico );

ALTER TABLE requisitos
    ADD CONSTRAINT requisitos_asignatura_fk FOREIGN KEY ( asignatura_idasignatura )
        REFERENCES asignatura ( idasignatura );

ALTER TABLE requisitos
    ADD CONSTRAINT requisitos_asignatura_fkv2 FOREIGN KEY ( asignatura_idasignatura1 )
        REFERENCES asignatura ( idasignatura );

ALTER TABLE requisitos
    ADD CONSTRAINT requisitos_planestudios_fk FOREIGN KEY ( planestudios_idplanestudios )
        REFERENCES planestudios ( idplanestudios );

ALTER TABLE simultaneidad
    ADD CONSTRAINT simultaneidad_asignatura_fk FOREIGN KEY ( asignatura_idasignatura )
        REFERENCES asignatura ( idasignatura );

ALTER TABLE simultaneidad
    ADD CONSTRAINT simultaneidad_asignatura2_fk FOREIGN KEY ( asignatura_idasignatura1 )
        REFERENCES asignatura ( idasignatura );

ALTER TABLE simultaneidad
    ADD CONSTRAINT simultaneidad_planestudios_fk FOREIGN KEY ( planestudios_idplanestudios )
        REFERENCES planestudios ( idplanestudios );

CREATE SEQUENCE grupos_grupos_id_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER grupos_grupos_id_trg BEFORE
    INSERT ON grupos
    FOR EACH ROW
    WHEN ( new.grupos_id IS NULL )
BEGIN
    :new.grupos_id := grupos_grupos_id_seq.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            21
-- CREATE INDEX                             0
-- ALTER TABLE                             54
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          1
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   7
-- WARNINGS                                 0
