class Animal {
    constructor(name, age, species) {
      this.name = name;
      this.age = age;
      this.species = species;
    }
  
    eat() {
      console.log(`${this.name} is eating.`);
    }
  
    sleep() {
      console.log(`${this.name} is sleeping.`);
    }
  
    make_sound() {
      console.log(`${this.name} is making a sound.`);
    }
  
    str() {
      console.log(`Name: ${this.name} | Age: ${this.age} | Species: ${this.species}`);
    }
  }
  
  class Mammal extends Animal {
    constructor(name, age, species, fur_color, num_legs) {
      super(name, age, species);
      this.fur_color = fur_color;
      this.num_legs = num_legs;
    }
  
    give_birth() {
      console.log(`${this.name} is giving birth.`);
    }
  
    nurse_young() {
      console.log(`${this.name} is nursing its young.`);
    }
  
    str() {
      console.log(`Name: ${this.name} | Age: ${this.age} | Species: ${this.species} | Fur Color: ${this.fur_color} | Number of Legs: ${this.num_legs}`);
    }
  }
  
  class Bird extends Animal {
    constructor(name, age, species, wing_span, beak_length) {
      super(name, age, species);
      this.wing_span = wing_span;
      this.beak_length = beak_length;
    }
  
    fly() {
      console.log(`${this.name} is flying.`);
    }
  
    build_nest() {
      console.log(`${this.name} is building a nest.`);
    }
  
    str() {
      console.log(`Name: ${this.name} | Age: ${this.age} | Species: ${this.species} | Wing Span: ${this.wing_span} | Beak Length: ${this.beak_length}`);
    }
  }
  
  class Reptile extends Animal {
    constructor(name, age, species, scale_color, venom_type) {
      super(name, age, species);
      this.scale_color = scale_color;
      this.venom_type = venom_type;
    }
  
    lay_eggs() {
      console.log(`${this.name} is laying eggs.`);
    }
  
    shed_skin() {
      console.log(`${this.name} is shedding its skin.`);
    }
  
    str() {
      console.log(`Name: ${this.name} | Age: ${this.age} | Species: ${this.species} | Scale Color: ${this.scale_color} | Venom Type: ${this.venom_type}`);
    }
  }
  
  class Enclosure {
    constructor(name, size, temperature) {
      this.name = name;
      this.size = size;
      this.temperature = temperature;
      this.animals = [];
    }
  
    add_animal(animal) {
      this.animals.push(animal);
    }
  
    remove_animal(animal) {
      const index = this.animals.indexOf(animal);
      this.animals.splice(index, 1);
    }
  
    str() {
      console.log(`Enclosure Name: ${this.name} | Size: ${this.size} | Temperature: ${this.temperature}`);
      this.animals.forEach(animal => {
        animal.str();
      });
    }
  }
  
  class Zookeeper {
    constructor(name, years_of_experience) {
      this.name = name;
      this.years_of_experience = years_of_experience;
    }
  
    feed_animals(enclosure) {
      console.log(`${this.name} is feeding the animals in the ${enclosure.name} enclosure.`);
      enclosure.animals.forEach(animal => {
        animal.eat();
      });
    }
  
    clean_enclosures(enclosure) {
      console.log(`${this.name} is cleaning the ${enclosure.name} enclosure.`);
    }
  }
  
  class Zoo {
    constructor(name, location) {
      this.name = name;
      this.location = location;
      this.enclosures = [];
      this.zookeepers = [];
    }
  
    add_enclosure(enclosure) {
      this.enclosures.push(enclosure);
    }
  
    remove_enclosure(enclosure) {
      const index = this.enclosures.indexOf(enclosure);
      this.enclosures.splice(index, 1);
    }
  
    add_zookeeper(zookeeper) {
      this.zookeepers.push(zookeeper);
    }
  
    remove_zookeeper(zookeeper) {
      const index = this.zookeepers.indexOf(zookeeper);
      this.zookeepers.splice(index, 1);
    }
  
    str() {
      console.log(`Zoo Name: ${this.name} | Location: ${this.location}`);
      this.enclosures.forEach(enclosure => {
        enclosure.str();
      });
    }
  }