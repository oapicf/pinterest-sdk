import { Board } from './board';


export interface BoardsList200Response { 
  bookmark?: string | null;
  items: Array<Board>;
}

