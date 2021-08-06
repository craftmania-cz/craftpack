<br />
<p align="center">
    <h1 align="center">CraftPack</h1>
</p>
<p align="center">
  <img src="https://img.shields.io/badge/language-kotlin-orange?style=for-the-badge">
    
</p>
<p align="center">
    CraftPack slouží jako plugin API pro náš Resource pack na serveru. Obsahuje všechny itemy, menu a položky, které jsou v Resource Packu, tak aby šli jednoduše vygenerovat na serveru.
</p>

## Obsah

* [Integrace do pluginu](#integrace-craftpacku-do-pluginu)

## Integrace CraftPacku do pluginu

#### Gradle

```
repositories {
    maven { url "https://packages.craftmania.cz/repository/craftmania/" }
}

dependencies {
    compileOnly group: 'cz.craftmania.craftpack', name: 'craftpack', version: '1.2.0'
}
```

## Tabulka itemů
Tato tabulka obsahuje, které itemy se na co používají.

| Cosmetic Type | Minecraft Type |
| :--- | :---: |
| CoinShop Hats | `PAPER` |
| Interactible Hats | `SUGAR` |
| Hand Items (Attack type) | `STICK` |
| Hand Items (Decorative) | `LIME_DYE` |
| Furniture | `SCUTE` |
| Crates | `FIREWORK_STAR` |
| Interactible Holograms | `WHEAT` |
| GUI Items | `IRON_NUGGET` |
