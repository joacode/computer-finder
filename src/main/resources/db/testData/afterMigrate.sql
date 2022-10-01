INSERT INTO computers (
    id, model_name, brand, display_resolution, display_size, cpu, gpu, ram, expandable_ram, base_storage, expandable_storage, is_ssd)
VALUES(
       1,
       'MacBook M1',
       'Apple',
       '2560x1600',
       '13.3 inch',
       'M1 (8-core)',
       'M1 (7-core)',
       '8GB',
       true,
       '256GB',
       true,
       true
      ) ON CONFLICT (id) DO NOTHING;