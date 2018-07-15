PROCEDURE BD is
  TASK type proceso1;
  TASK type proceso2;
  TASK type proceso3;
  TASK admin_bd is
    entry quiero_leer();
    entry quiero_escribir();
    entry termine_leer();
    entry termine_escribir();
  end admin_bd;

  TASK body proceso1 is
      accedi: boolean;
  begin
      accedi := false;
      loop
          SELECT admin_bd.quierlo_escribir();
				//accedo BD
				admin_bd.termine_escribir();
          OR delay 2;  
			delay 5;
          END select;
      end loop;
  end proceso1;
  
  TASK body proceso2 is
      accedi: boolean;
  begin
      accedi := false;
      loop
          SELECT admin_bd.quierlo_escribir();
				//accedo BD
				admin_bd.termine_escribir();
          OR delay 5;
             SELECT 
				admin_bd.quierlo_leer();
				//accedo BD
				admin_bd.termine_leer();
			 OR
				delay 5;
			 END select;
		  END SELECT
      end loop;
  end proceso2;
  
  
  TASK body proceso3 is
      accedi: boolean;
  begin
      accedi := false;
      loop
          SELECT admin_bd.quierlo_leer();
				//accedo BD
				admin_bd.termine_leer();
          ELSE
				admin_bd.quierlo_escribir();
				//accedo BD
				admin_bd.termine_escribir();
          END select;
      end loop;
  end proceso3;
  
  
  TASK body admin_bd is
      integer leyendo, escribiendo := 0;
  begin
      while (true) do begin
          SELECT
              WHEN(escribiendo = 0 AND quiero_escribir count = 0) => acccept quiero_leer() do
                                                                     leyendo := leyendo + 1;
                                                                     end quiero_leer;
              or 
				WHEN (leyendo = 0 AND escribiendo = 0) => accept quiero_escribir() do
                                                                 escribiendo := escribiendo +1;
                                                          end quiero_escrbir;
              or ACCEPT termine_leer() do
                  leyendo:=leyendo-1;
                 end termine_leer;
              or ACCEPT termine_escribir() do
                  escrbiendo:=escribiendo-1;
              end termine_escribir;
          END SELECT
      end while;
  end admin_bd;
