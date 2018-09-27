import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService{

  createDb() {
    const heroes = [
      { id: 1, name: 'Goku' },
      { id: 2, name: 'Vegeta' },
      { id: 3, name: 'Naruto' },
      { id: 4, name: 'Sasuke' },
      { id: 5, name: 'Kakashi' },
      { id: 6, name: 'Zoro' },
      { id: 7, name: 'Luffy' },
      { id: 8, name: 'Deku' },
      { id: 9, name: 'AllMight' },
      { id: 10, name: 'Edward Elric' }
    ];
    return {heroes};
  }
}
