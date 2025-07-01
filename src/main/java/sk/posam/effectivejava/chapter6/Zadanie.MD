# Výpočet ceny dopravy s možnosťou budúceho rozšírenia

## 📄 Popis

Náš e-shop ponúka zákazníkom rôzne spôsoby dopravy tovaru. Každý spôsob dopravy má iný spôsob výpočtu ceny na základe parametrov ako hmotnosť zásielky a vzdialenosť doručenia. V budúcnosti plánujeme pridávať ďalšie nové spôsoby dopravy – preto potrebujeme systém, ktorý umožní tieto rozšírenia bez zásahov do existujúceho kódu.

## 🎯 Cieľ

Navrhnite a implementujte riešenie, ktoré:

- Umožní reprezentovať rôzne spôsoby dopravy
- Pre každý spôsob dopravy vypočíta cenu na základe zadaných vstupov
- Bude jednoducho rozšíriteľné o nové spôsoby dopravy bez potreby meniť existujúci výpočet alebo centrálny prehľad

## 📌 Požiadavky

### Spôsoby dopravy

V systéme by mali byť implementované aspoň nasledujúce spôsoby:

- **Poštová služba**: cena = 2 + 0.5 * hmotnosť + 0.1 * vzdialenosť
- **Kuriér**: cena = 5 + 0.2 * hmotnosť + 0.2 * vzdialenosť
- **Expresné doručenie – rovnaký deň**: cena = 10 + 0.4 * hmotnosť
- **Expresné doručenie – nasledujúci deň**: cena = 7 + 0.3 * hmotnosť

### Vstupy

Výpočet ceny musí byť založený minimálne na týchto parametroch:

- Hmotnosť zásielky (v kilogramoch, `double`)
- Vzdialenosť doručenia (v kilometroch, `double`)

### Výstupy

V konzolovej aplikácii alebo jednotkových testoch predveďte:

- Výpočet ceny pre rôzne spôsoby dopravy pri rôznych vstupných parametroch
- Zobrazenie názvu spôsobu dopravy a vypočítanej ceny

### Architektúra

- Riešenie musí byť navrhnuté tak, aby bolo možné pridávať nové typy dopravy bez zmeny existujúceho kódu
- Každý spôsob dopravy má vlastný výpočtový algoritmus