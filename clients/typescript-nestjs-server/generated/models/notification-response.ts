

export interface NotificationResponse { 
  /**
   * error message when success is false
   */
  error_msg?: string;
  /**
   * Received time. Unix timestamp in seconds.
   */
  received_at?: number;
  /**
   * Returns true if the notification accepted.
   */
  success?: boolean;
}

