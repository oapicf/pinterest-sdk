//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SharedAudienceAccount {
  /// Returns a new [SharedAudienceAccount] instance.
  SharedAudienceAccount({
    required this.accountId,
    required this.accountName,
    required this.accountType,
    required this.sharedOnTimestamp,
  });

  /// Account ID (ad account or business ID).
  String accountId;

  /// Account name.
  String accountName;

  /// account type
  SharedAudienceAccountAccountTypeEnum accountType;

  /// Epoch timestamp in seconds for the shared audience event
  int sharedOnTimestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SharedAudienceAccount &&
    other.accountId == accountId &&
    other.accountName == accountName &&
    other.accountType == accountType &&
    other.sharedOnTimestamp == sharedOnTimestamp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (accountId.hashCode) +
    (accountName.hashCode) +
    (accountType.hashCode) +
    (sharedOnTimestamp.hashCode);

  @override
  String toString() => 'SharedAudienceAccount[accountId=$accountId, accountName=$accountName, accountType=$accountType, sharedOnTimestamp=$sharedOnTimestamp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'account_id'] = this.accountId;
      json[r'account_name'] = this.accountName;
      json[r'account_type'] = this.accountType;
      json[r'shared_on_timestamp'] = this.sharedOnTimestamp;
    return json;
  }

  /// Returns a new [SharedAudienceAccount] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SharedAudienceAccount? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SharedAudienceAccount[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SharedAudienceAccount[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SharedAudienceAccount(
        accountId: mapValueOfType<String>(json, r'account_id')!,
        accountName: mapValueOfType<String>(json, r'account_name')!,
        accountType: SharedAudienceAccountAccountTypeEnum.fromJson(json[r'account_type'])!,
        sharedOnTimestamp: mapValueOfType<int>(json, r'shared_on_timestamp')!,
      );
    }
    return null;
  }

  static List<SharedAudienceAccount> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SharedAudienceAccount>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SharedAudienceAccount.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SharedAudienceAccount> mapFromJson(dynamic json) {
    final map = <String, SharedAudienceAccount>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SharedAudienceAccount.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SharedAudienceAccount-objects as value to a dart map
  static Map<String, List<SharedAudienceAccount>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SharedAudienceAccount>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SharedAudienceAccount.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'account_id',
    'account_name',
    'account_type',
    'shared_on_timestamp',
  };
}

/// account type
class SharedAudienceAccountAccountTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const SharedAudienceAccountAccountTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AD_ACCOUNT = SharedAudienceAccountAccountTypeEnum._(r'AD_ACCOUNT');
  static const BUSINESS_ACCOUNT = SharedAudienceAccountAccountTypeEnum._(r'BUSINESS_ACCOUNT');

  /// List of all possible values in this [enum][SharedAudienceAccountAccountTypeEnum].
  static const values = <SharedAudienceAccountAccountTypeEnum>[
    AD_ACCOUNT,
    BUSINESS_ACCOUNT,
  ];

  static SharedAudienceAccountAccountTypeEnum? fromJson(dynamic value) => SharedAudienceAccountAccountTypeEnumTypeTransformer().decode(value);

  static List<SharedAudienceAccountAccountTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SharedAudienceAccountAccountTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SharedAudienceAccountAccountTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SharedAudienceAccountAccountTypeEnum] to String,
/// and [decode] dynamic data back to [SharedAudienceAccountAccountTypeEnum].
class SharedAudienceAccountAccountTypeEnumTypeTransformer {
  factory SharedAudienceAccountAccountTypeEnumTypeTransformer() => _instance ??= const SharedAudienceAccountAccountTypeEnumTypeTransformer._();

  const SharedAudienceAccountAccountTypeEnumTypeTransformer._();

  String encode(SharedAudienceAccountAccountTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a SharedAudienceAccountAccountTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SharedAudienceAccountAccountTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AD_ACCOUNT': return SharedAudienceAccountAccountTypeEnum.AD_ACCOUNT;
        case r'BUSINESS_ACCOUNT': return SharedAudienceAccountAccountTypeEnum.BUSINESS_ACCOUNT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [SharedAudienceAccountAccountTypeEnumTypeTransformer] instance.
  static SharedAudienceAccountAccountTypeEnumTypeTransformer? _instance;
}


