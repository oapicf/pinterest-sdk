//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserWebsiteVerifyRequest {
  /// Returns a new [UserWebsiteVerifyRequest] instance.
  UserWebsiteVerifyRequest({
    this.verificationMethod = const UserWebsiteVerifyRequestVerificationMethodEnum._('METATAG'),
    this.website,
  });

  UserWebsiteVerifyRequestVerificationMethodEnum verificationMethod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserWebsiteVerifyRequest &&
    other.verificationMethod == verificationMethod &&
    other.website == website;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (verificationMethod.hashCode) +
    (website == null ? 0 : website!.hashCode);

  @override
  String toString() => 'UserWebsiteVerifyRequest[verificationMethod=$verificationMethod, website=$website]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'verification_method'] = this.verificationMethod;
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    return json;
  }

  /// Returns a new [UserWebsiteVerifyRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserWebsiteVerifyRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserWebsiteVerifyRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserWebsiteVerifyRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserWebsiteVerifyRequest(
        verificationMethod: UserWebsiteVerifyRequestVerificationMethodEnum.fromJson(json[r'verification_method']) ?? 'METATAG',
        website: mapValueOfType<String>(json, r'website'),
      );
    }
    return null;
  }

  static List<UserWebsiteVerifyRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserWebsiteVerifyRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserWebsiteVerifyRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserWebsiteVerifyRequest> mapFromJson(dynamic json) {
    final map = <String, UserWebsiteVerifyRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserWebsiteVerifyRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserWebsiteVerifyRequest-objects as value to a dart map
  static Map<String, List<UserWebsiteVerifyRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserWebsiteVerifyRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserWebsiteVerifyRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class UserWebsiteVerifyRequestVerificationMethodEnum {
  /// Instantiate a new enum with the provided [value].
  const UserWebsiteVerifyRequestVerificationMethodEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const FILENAME = UserWebsiteVerifyRequestVerificationMethodEnum._(r'FILENAME');
  static const METATAG = UserWebsiteVerifyRequestVerificationMethodEnum._(r'METATAG');
  static const DNSTXT = UserWebsiteVerifyRequestVerificationMethodEnum._(r'DNSTXT');

  /// List of all possible values in this [enum][UserWebsiteVerifyRequestVerificationMethodEnum].
  static const values = <UserWebsiteVerifyRequestVerificationMethodEnum>[
    FILENAME,
    METATAG,
    DNSTXT,
  ];

  static UserWebsiteVerifyRequestVerificationMethodEnum? fromJson(dynamic value) => UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer().decode(value);

  static List<UserWebsiteVerifyRequestVerificationMethodEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserWebsiteVerifyRequestVerificationMethodEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserWebsiteVerifyRequestVerificationMethodEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserWebsiteVerifyRequestVerificationMethodEnum] to String,
/// and [decode] dynamic data back to [UserWebsiteVerifyRequestVerificationMethodEnum].
class UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer {
  factory UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer() => _instance ??= const UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer._();

  const UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer._();

  String encode(UserWebsiteVerifyRequestVerificationMethodEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UserWebsiteVerifyRequestVerificationMethodEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserWebsiteVerifyRequestVerificationMethodEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'FILENAME': return UserWebsiteVerifyRequestVerificationMethodEnum.FILENAME;
        case r'METATAG': return UserWebsiteVerifyRequestVerificationMethodEnum.METATAG;
        case r'DNSTXT': return UserWebsiteVerifyRequestVerificationMethodEnum.DNSTXT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer] instance.
  static UserWebsiteVerifyRequestVerificationMethodEnumTypeTransformer? _instance;
}


