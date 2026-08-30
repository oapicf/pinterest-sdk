//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccount {
  /// Returns a new [AdAccount] instance.
  AdAccount({
    this.country,
    this.createdTime,
    this.currency,
    required this.id,
    this.name,
    this.owner,
    this.permissions = const [],
    this.timeZone,
    this.updatedTime,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  ///  Creation time. Unix timestamp in seconds.
  int? createdTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Currency? currency;

  String id;

  /// Ad account name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Ad account owner
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AdAccountOwner? owner;

  List<BusinessAccessRole> permissions;

  /// The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? timeZone;

  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccount &&
    other.country == country &&
    other.createdTime == createdTime &&
    other.currency == currency &&
    other.id == id &&
    other.name == name &&
    other.owner == owner &&
    _deepEquality.equals(other.permissions, permissions) &&
    other.timeZone == timeZone &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country == null ? 0 : country!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (currency == null ? 0 : currency!.hashCode) +
    (id.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (owner == null ? 0 : owner!.hashCode) +
    (permissions.hashCode) +
    (timeZone == null ? 0 : timeZone!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'AdAccount[country=$country, createdTime=$createdTime, currency=$currency, id=$id, name=$name, owner=$owner, permissions=$permissions, timeZone=$timeZone, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.currency != null) {
      json[r'currency'] = this.currency;
    } else {
      json[r'currency'] = null;
    }
      json[r'id'] = this.id;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.owner != null) {
      json[r'owner'] = this.owner;
    } else {
      json[r'owner'] = null;
    }
      json[r'permissions'] = this.permissions;
    if (this.timeZone != null) {
      json[r'time_zone'] = this.timeZone;
    } else {
      json[r'time_zone'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccount] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccount? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "AdAccount[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AdAccount[id]" has a null value in JSON.');
        return true;
      }());

      return AdAccount(
        country: Country.fromJson(json[r'country']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        currency: Currency.fromJson(json[r'currency']),
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name'),
        owner: AdAccountOwner.fromJson(json[r'owner']),
        permissions: BusinessAccessRole.listFromJson(json[r'permissions']),
        timeZone: mapValueOfType<String>(json, r'time_zone'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<AdAccount> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccount>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccount.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccount> mapFromJson(dynamic json) {
    final map = <String, AdAccount>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccount.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccount-objects as value to a dart map
  static Map<String, List<AdAccount>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccount>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccount.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

