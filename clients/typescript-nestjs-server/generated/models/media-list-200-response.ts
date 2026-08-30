import { Media } from './media';


export interface MediaList200Response { 
  bookmark?: string | null;
  items: Array<Media>;
}

