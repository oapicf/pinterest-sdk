import { LeadForm } from './lead-form';


export interface LeadFormsList200Response { 
  bookmark?: string | null;
  items: Array<LeadForm>;
}

