//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationLog {
  /// Returns a new [IntegrationLog] instance.
  IntegrationLog({
    this.advertiserId,
    this.appVersionNumber,
    required this.clientTimestamp,
    this.error,
    required this.eventType,
    this.externalBusinessId,
    this.feedProfileId,
    required this.logLevel,
    this.merchantId,
    this.message,
    this.platformVersionNumber,
    this.request,
    this.tagId,
  });

  String? advertiserId;

  /// Version number of the integration application.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appVersionNumber;

  /// Timestamp in milliseconds of when the log was executed at the client.
  int clientTimestamp;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  IntegrationLogClientError? error;

  /// Log event type
  IntegrationLogEventTypeEnum eventType;

  String? externalBusinessId;

  String? feedProfileId;

  /// Log level type
  IntegrationLogLogLevelEnum logLevel;

  String? merchantId;

  /// Explanation of the event that occured.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// Version number of the platform the integration application is running on.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? platformVersionNumber;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  IntegrationLogClientRequest? request;

  String? tagId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationLog &&
    other.advertiserId == advertiserId &&
    other.appVersionNumber == appVersionNumber &&
    other.clientTimestamp == clientTimestamp &&
    other.error == error &&
    other.eventType == eventType &&
    other.externalBusinessId == externalBusinessId &&
    other.feedProfileId == feedProfileId &&
    other.logLevel == logLevel &&
    other.merchantId == merchantId &&
    other.message == message &&
    other.platformVersionNumber == platformVersionNumber &&
    other.request == request &&
    other.tagId == tagId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advertiserId == null ? 0 : advertiserId!.hashCode) +
    (appVersionNumber == null ? 0 : appVersionNumber!.hashCode) +
    (clientTimestamp.hashCode) +
    (error == null ? 0 : error!.hashCode) +
    (eventType.hashCode) +
    (externalBusinessId == null ? 0 : externalBusinessId!.hashCode) +
    (feedProfileId == null ? 0 : feedProfileId!.hashCode) +
    (logLevel.hashCode) +
    (merchantId == null ? 0 : merchantId!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (platformVersionNumber == null ? 0 : platformVersionNumber!.hashCode) +
    (request == null ? 0 : request!.hashCode) +
    (tagId == null ? 0 : tagId!.hashCode);

  @override
  String toString() => 'IntegrationLog[advertiserId=$advertiserId, appVersionNumber=$appVersionNumber, clientTimestamp=$clientTimestamp, error=$error, eventType=$eventType, externalBusinessId=$externalBusinessId, feedProfileId=$feedProfileId, logLevel=$logLevel, merchantId=$merchantId, message=$message, platformVersionNumber=$platformVersionNumber, request=$request, tagId=$tagId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.advertiserId != null) {
      json[r'advertiser_id'] = this.advertiserId;
    } else {
      json[r'advertiser_id'] = null;
    }
    if (this.appVersionNumber != null) {
      json[r'app_version_number'] = this.appVersionNumber;
    } else {
      json[r'app_version_number'] = null;
    }
      json[r'client_timestamp'] = this.clientTimestamp;
    if (this.error != null) {
      json[r'error'] = this.error;
    } else {
      json[r'error'] = null;
    }
      json[r'event_type'] = this.eventType;
    if (this.externalBusinessId != null) {
      json[r'external_business_id'] = this.externalBusinessId;
    } else {
      json[r'external_business_id'] = null;
    }
    if (this.feedProfileId != null) {
      json[r'feed_profile_id'] = this.feedProfileId;
    } else {
      json[r'feed_profile_id'] = null;
    }
      json[r'log_level'] = this.logLevel;
    if (this.merchantId != null) {
      json[r'merchant_id'] = this.merchantId;
    } else {
      json[r'merchant_id'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.platformVersionNumber != null) {
      json[r'platform_version_number'] = this.platformVersionNumber;
    } else {
      json[r'platform_version_number'] = null;
    }
    if (this.request != null) {
      json[r'request'] = this.request;
    } else {
      json[r'request'] = null;
    }
    if (this.tagId != null) {
      json[r'tag_id'] = this.tagId;
    } else {
      json[r'tag_id'] = null;
    }
    return json;
  }

  /// Returns a new [IntegrationLog] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationLog? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "IntegrationLog[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "IntegrationLog[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return IntegrationLog(
        advertiserId: mapValueOfType<String>(json, r'advertiser_id'),
        appVersionNumber: mapValueOfType<String>(json, r'app_version_number'),
        clientTimestamp: mapValueOfType<int>(json, r'client_timestamp')!,
        error: IntegrationLogClientError.fromJson(json[r'error']),
        eventType: IntegrationLogEventTypeEnum.fromJson(json[r'event_type'])!,
        externalBusinessId: mapValueOfType<String>(json, r'external_business_id'),
        feedProfileId: mapValueOfType<String>(json, r'feed_profile_id'),
        logLevel: IntegrationLogLogLevelEnum.fromJson(json[r'log_level'])!,
        merchantId: mapValueOfType<String>(json, r'merchant_id'),
        message: mapValueOfType<String>(json, r'message'),
        platformVersionNumber: mapValueOfType<String>(json, r'platform_version_number'),
        request: IntegrationLogClientRequest.fromJson(json[r'request']),
        tagId: mapValueOfType<String>(json, r'tag_id'),
      );
    }
    return null;
  }

  static List<IntegrationLog> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLog>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLog.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationLog> mapFromJson(dynamic json) {
    final map = <String, IntegrationLog>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationLog.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationLog-objects as value to a dart map
  static Map<String, List<IntegrationLog>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationLog>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationLog.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'client_timestamp',
    'event_type',
    'log_level',
  };
}

/// Log event type
class IntegrationLogEventTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const IntegrationLogEventTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const APP = IntegrationLogEventTypeEnum._(r'APP');
  static const API = IntegrationLogEventTypeEnum._(r'API');

  /// List of all possible values in this [enum][IntegrationLogEventTypeEnum].
  static const values = <IntegrationLogEventTypeEnum>[
    APP,
    API,
  ];

  static IntegrationLogEventTypeEnum? fromJson(dynamic value) => IntegrationLogEventTypeEnumTypeTransformer().decode(value);

  static List<IntegrationLogEventTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogEventTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogEventTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [IntegrationLogEventTypeEnum] to String,
/// and [decode] dynamic data back to [IntegrationLogEventTypeEnum].
class IntegrationLogEventTypeEnumTypeTransformer {
  factory IntegrationLogEventTypeEnumTypeTransformer() => _instance ??= const IntegrationLogEventTypeEnumTypeTransformer._();

  const IntegrationLogEventTypeEnumTypeTransformer._();

  String encode(IntegrationLogEventTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a IntegrationLogEventTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IntegrationLogEventTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'APP': return IntegrationLogEventTypeEnum.APP;
        case r'API': return IntegrationLogEventTypeEnum.API;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [IntegrationLogEventTypeEnumTypeTransformer] instance.
  static IntegrationLogEventTypeEnumTypeTransformer? _instance;
}


/// Log level type
class IntegrationLogLogLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const IntegrationLogLogLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const INFO = IntegrationLogLogLevelEnum._(r'INFO');
  static const WARN = IntegrationLogLogLevelEnum._(r'WARN');
  static const ERROR = IntegrationLogLogLevelEnum._(r'ERROR');

  /// List of all possible values in this [enum][IntegrationLogLogLevelEnum].
  static const values = <IntegrationLogLogLevelEnum>[
    INFO,
    WARN,
    ERROR,
  ];

  static IntegrationLogLogLevelEnum? fromJson(dynamic value) => IntegrationLogLogLevelEnumTypeTransformer().decode(value);

  static List<IntegrationLogLogLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogLogLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogLogLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [IntegrationLogLogLevelEnum] to String,
/// and [decode] dynamic data back to [IntegrationLogLogLevelEnum].
class IntegrationLogLogLevelEnumTypeTransformer {
  factory IntegrationLogLogLevelEnumTypeTransformer() => _instance ??= const IntegrationLogLogLevelEnumTypeTransformer._();

  const IntegrationLogLogLevelEnumTypeTransformer._();

  String encode(IntegrationLogLogLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a IntegrationLogLogLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IntegrationLogLogLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'INFO': return IntegrationLogLogLevelEnum.INFO;
        case r'WARN': return IntegrationLogLogLevelEnum.WARN;
        case r'ERROR': return IntegrationLogLogLevelEnum.ERROR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [IntegrationLogLogLevelEnumTypeTransformer] instance.
  static IntegrationLogLogLevelEnumTypeTransformer? _instance;
}


