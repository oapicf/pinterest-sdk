import { CatalogsFeedIngestionInfo } from './catalogs-feed-ingestion-info';
import { CatalogsFeedIngestionErrors } from './catalogs-feed-ingestion-errors';
import { CatalogsFeedIngestionWarnings } from './catalogs-feed-ingestion-warnings';


export interface CatalogsFeedIngestionDetails { 
  errors: CatalogsFeedIngestionErrors;
  info: CatalogsFeedIngestionInfo;
  warnings: CatalogsFeedIngestionWarnings;
}

