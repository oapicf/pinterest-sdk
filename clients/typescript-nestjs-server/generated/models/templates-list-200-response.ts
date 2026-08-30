import { AccountTemplate } from './account-template';


export interface TemplatesList200Response { 
  bookmark?: string | null;
  items: Array<AccountTemplate>;
}

