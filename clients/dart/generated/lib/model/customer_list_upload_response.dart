//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomerListUploadResponse {
  /// Returns a new [CustomerListUploadResponse] instance.
  CustomerListUploadResponse({
    required this.adAccountId,
    required this.creationTime,
    required this.customerListId,
    this.errorCounts = const [],
    required this.id,
    required this.operation,
    this.recordCounts,
    required this.state,
    required this.updatedTime,
  });

  /// Advertiser ID.
  String adAccountId;

  /// Customer List Upload creation_time. Epoch (seconds).
  int creationTime;

  /// ID of the customer list associated with this upload.
  String customerListId;

  /// Error counts by error code
  List<ErrorDetail>? errorCounts;

  /// Customer List Upload ID.
  String id;

  UserListOperationType operation;

  RecordCounts? recordCounts;

  /// Workload processing state
  CustomerListUploadResponseStateEnum state;

  /// Customer List Upload updated_time. Epoch (seconds).
  int updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomerListUploadResponse &&
    other.adAccountId == adAccountId &&
    other.creationTime == creationTime &&
    other.customerListId == customerListId &&
    _deepEquality.equals(other.errorCounts, errorCounts) &&
    other.id == id &&
    other.operation == operation &&
    other.recordCounts == recordCounts &&
    other.state == state &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId.hashCode) +
    (creationTime.hashCode) +
    (customerListId.hashCode) +
    (errorCounts == null ? 0 : errorCounts!.hashCode) +
    (id.hashCode) +
    (operation.hashCode) +
    (recordCounts == null ? 0 : recordCounts!.hashCode) +
    (state.hashCode) +
    (updatedTime.hashCode);

  @override
  String toString() => 'CustomerListUploadResponse[adAccountId=$adAccountId, creationTime=$creationTime, customerListId=$customerListId, errorCounts=$errorCounts, id=$id, operation=$operation, recordCounts=$recordCounts, state=$state, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_account_id'] = this.adAccountId;
      json[r'creation_time'] = this.creationTime;
      json[r'customer_list_id'] = this.customerListId;
    if (this.errorCounts != null) {
      json[r'error_counts'] = this.errorCounts;
    } else {
      json[r'error_counts'] = null;
    }
      json[r'id'] = this.id;
      json[r'operation'] = this.operation;
    if (this.recordCounts != null) {
      json[r'record_counts'] = this.recordCounts;
    } else {
      json[r'record_counts'] = null;
    }
      json[r'state'] = this.state;
      json[r'updated_time'] = this.updatedTime;
    return json;
  }

  /// Returns a new [CustomerListUploadResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomerListUploadResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CustomerListUploadResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CustomerListUploadResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CustomerListUploadResponse(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id')!,
        creationTime: mapValueOfType<int>(json, r'creation_time')!,
        customerListId: mapValueOfType<String>(json, r'customer_list_id')!,
        errorCounts: ErrorDetail.listFromJson(json[r'error_counts']),
        id: mapValueOfType<String>(json, r'id')!,
        operation: UserListOperationType.fromJson(json[r'operation'])!,
        recordCounts: RecordCounts.fromJson(json[r'record_counts']),
        state: CustomerListUploadResponseStateEnum.fromJson(json[r'state'])!,
        updatedTime: mapValueOfType<int>(json, r'updated_time')!,
      );
    }
    return null;
  }

  static List<CustomerListUploadResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUploadResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUploadResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomerListUploadResponse> mapFromJson(dynamic json) {
    final map = <String, CustomerListUploadResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomerListUploadResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomerListUploadResponse-objects as value to a dart map
  static Map<String, List<CustomerListUploadResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomerListUploadResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomerListUploadResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_account_id',
    'creation_time',
    'customer_list_id',
    'id',
    'operation',
    'state',
    'updated_time',
  };
}

/// Workload processing state
class CustomerListUploadResponseStateEnum {
  /// Instantiate a new enum with the provided [value].
  const CustomerListUploadResponseStateEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NOT_STARTED = CustomerListUploadResponseStateEnum._(r'NOT_STARTED');
  static const RUNNING = CustomerListUploadResponseStateEnum._(r'RUNNING');
  static const PAUSED = CustomerListUploadResponseStateEnum._(r'PAUSED');
  static const SUCCEEDED = CustomerListUploadResponseStateEnum._(r'SUCCEEDED');
  static const FAILED = CustomerListUploadResponseStateEnum._(r'FAILED');

  /// List of all possible values in this [enum][CustomerListUploadResponseStateEnum].
  static const values = <CustomerListUploadResponseStateEnum>[
    NOT_STARTED,
    RUNNING,
    PAUSED,
    SUCCEEDED,
    FAILED,
  ];

  static CustomerListUploadResponseStateEnum? fromJson(dynamic value) => CustomerListUploadResponseStateEnumTypeTransformer().decode(value);

  static List<CustomerListUploadResponseStateEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomerListUploadResponseStateEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomerListUploadResponseStateEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CustomerListUploadResponseStateEnum] to String,
/// and [decode] dynamic data back to [CustomerListUploadResponseStateEnum].
class CustomerListUploadResponseStateEnumTypeTransformer {
  factory CustomerListUploadResponseStateEnumTypeTransformer() => _instance ??= const CustomerListUploadResponseStateEnumTypeTransformer._();

  const CustomerListUploadResponseStateEnumTypeTransformer._();

  String encode(CustomerListUploadResponseStateEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CustomerListUploadResponseStateEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CustomerListUploadResponseStateEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NOT_STARTED': return CustomerListUploadResponseStateEnum.NOT_STARTED;
        case r'RUNNING': return CustomerListUploadResponseStateEnum.RUNNING;
        case r'PAUSED': return CustomerListUploadResponseStateEnum.PAUSED;
        case r'SUCCEEDED': return CustomerListUploadResponseStateEnum.SUCCEEDED;
        case r'FAILED': return CustomerListUploadResponseStateEnum.FAILED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CustomerListUploadResponseStateEnumTypeTransformer] instance.
  static CustomerListUploadResponseStateEnumTypeTransformer? _instance;
}


