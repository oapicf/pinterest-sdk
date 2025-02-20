/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Class to storage authentication data
 */
export class AuthStorage {
  private storage: Map<string, string>;

  constructor() {
    this.storage = new Map();
  }

  /**
   * Sets the pinterest_oauth2 auth method value.
   *
   * @param value The new value to set for pinterest_oauth2.
   */
  setpinterest_oauth2(value: string): this {
    this.storage.set('pinterest_oauth2', value);
    return this;
  }

  /**
   * Removes the pinterest_oauth2 auth method value.
   */
  removepinterest_oauth2(): this {
    this.storage.delete('pinterest_oauth2');
    return this;
  }

  /**
   * Gets the pinterest_oauth2 auth method value.
   */
  getpinterest_oauth2(): null | string {
    return this.storage.get('pinterest_oauth2') || null;
  }

  /**
   * Sets the conversion_token auth method value.
   *
   * @param value The new value to set for conversion_token.
   */
  setconversion_token(value: string): this {
    this.storage.set('conversion_token', value);
    return this;
  }

  /**
   * Removes the conversion_token auth method value.
   */
  removeconversion_token(): this {
    this.storage.delete('conversion_token');
    return this;
  }

  /**
   * Gets the conversion_token auth method value.
   */
  getconversion_token(): null | string {
    return this.storage.get('conversion_token') || null;
  }

  /**
   * Sets the basic auth method value.
   *
   * @param value The new value to set for basic.
   */
  setbasic(value: string): this {
    this.storage.set('basic', value);
    return this;
  }

  /**
   * Removes the basic auth method value.
   */
  removebasic(): this {
    this.storage.delete('basic');
    return this;
  }

  /**
   * Gets the basic auth method value.
   */
  getbasic(): null | string {
    return this.storage.get('basic') || null;
  }

  /**
   * Sets the client_credentials auth method value.
   *
   * @param value The new value to set for client_credentials.
   */
  setclient_credentials(value: string): this {
    this.storage.set('client_credentials', value);
    return this;
  }

  /**
   * Removes the client_credentials auth method value.
   */
  removeclient_credentials(): this {
    this.storage.delete('client_credentials');
    return this;
  }

  /**
   * Gets the client_credentials auth method value.
   */
  getclient_credentials(): null | string {
    return this.storage.get('client_credentials') || null;
  }
}
