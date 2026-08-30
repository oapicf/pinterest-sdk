import { Ad } from './ad';


export interface AdsList200Response { 
  bookmark?: string | null;
  items: Array<Ad>;
}

