import { PinRead } from './pin-read';


export interface BoardsListPins200Response { 
  bookmark?: string | null;
  items: Array<PinRead>;
}

