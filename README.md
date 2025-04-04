# Solution_HomeWork-5

## Task 1: Proxy Pattern – Real Estate Image Management

### What problem was solved?
The application needed to display low-resolution thumbnails quickly to provide a smooth user experience while deferring the loading of heavy, high-resolution images. Without optimization, loading all full-size images at once would slow down the system and consume unnecessary memory and bandwidth.

### How did the pattern simplify or optimize the design?
The Proxy Pattern was applied by introducing a proxy object that holds a lightweight reference to the high-res image and only loads it when explicitly requested via `.displayFullImage()`. This separation between the interface and heavy object instantiation allows for lazy loading, which significantly improves performance and resource usage. Additionally, a Protection Proxy was added to ensure that only authenticated agents can upload or modify images, enhancing security.

---

## Task 2: Flyweight Pattern – Map Marker Rendering

### What problem was solved?
Rendering thousands of map markers, each with repeating visual styles (icons, colors, fonts), would consume a lot of memory if each marker had its own style object. The goal was to optimize memory usage by avoiding style duplication across similar markers.

### How did the pattern simplify or optimize the design?
The Flyweight Pattern was used to extract and share common marker styles among thousands of map marker objects. A `MarkerStyleFactory` ensures each unique style (e.g., hospital, restaurant, gas) is created once and reused, significantly reducing memory overhead. Logging and statistics were added to show how many unique styles exist versus the total number of markers, demonstrating the efficiency of shared flyweight instances.

---

Author: Abdrakhmanova Adel.
