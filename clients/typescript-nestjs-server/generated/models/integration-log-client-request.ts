import { HttpMethod } from './http-method';


/**
 * HTTP request details included in the log sent by the client.
 */
export interface IntegrationLogClientRequest { 
  /**
   * HTTP request host from host header.
   */
  host: string;
  method: HttpMethod;
  /**
   * HTTP request path.
   */
  path: string;
  /**
   * HTTP request headers as key-value pairs.
   */
  request_headers?: { [key: string]: string; };
  /**
   * HTTP response headers as key-value pairs.
   */
  response_headers?: { [key: string]: string; };
  response_status_code?: number;
}
export namespace IntegrationLogClientRequest {
}


