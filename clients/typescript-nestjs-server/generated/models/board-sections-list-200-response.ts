import { BoardSection } from './board-section';


export interface BoardSectionsList200Response { 
  bookmark?: string | null;
  items: Array<BoardSection>;
}

