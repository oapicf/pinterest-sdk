//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AppTypeMultipliers {
  /// Returns a new [AppTypeMultipliers] instance.
  AppTypeMultipliers({
    this.APP_TYPE,
  });

  AppTypeMultipliersAPP_TYPEEnum? APP_TYPE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AppTypeMultipliers &&
    other.APP_TYPE == APP_TYPE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (APP_TYPE == null ? 0 : APP_TYPE!.hashCode);

  @override
  String toString() => 'AppTypeMultipliers[APP_TYPE=$APP_TYPE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.APP_TYPE != null) {
      json[r'APP_TYPE'] = this.APP_TYPE;
    } else {
      json[r'APP_TYPE'] = null;
    }
    return json;
  }

  /// Returns a new [AppTypeMultipliers] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AppTypeMultipliers? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AppTypeMultipliers[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AppTypeMultipliers[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AppTypeMultipliers(
        APP_TYPE: AppTypeMultipliersAPP_TYPEEnum.fromJson(json[r'APP_TYPE']),
      );
    }
    return null;
  }

  static List<AppTypeMultipliers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AppTypeMultipliers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AppTypeMultipliers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AppTypeMultipliers> mapFromJson(dynamic json) {
    final map = <String, AppTypeMultipliers>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AppTypeMultipliers.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AppTypeMultipliers-objects as value to a dart map
  static Map<String, List<AppTypeMultipliers>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AppTypeMultipliers>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AppTypeMultipliers.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class AppTypeMultipliersAPP_TYPEEnum {
  /// Instantiate a new enum with the provided [value].
  const AppTypeMultipliersAPP_TYPEEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const androidMobile = AppTypeMultipliersAPP_TYPEEnum._(r'android_mobile');
  static const androidTablet = AppTypeMultipliersAPP_TYPEEnum._(r'android_tablet');
  static const ipad = AppTypeMultipliersAPP_TYPEEnum._(r'ipad');
  static const iphone = AppTypeMultipliersAPP_TYPEEnum._(r'iphone');
  static const web = AppTypeMultipliersAPP_TYPEEnum._(r'web');
  static const webMobile = AppTypeMultipliersAPP_TYPEEnum._(r'web_mobile');

  /// List of all possible values in this [enum][AppTypeMultipliersAPP_TYPEEnum].
  static const values = <AppTypeMultipliersAPP_TYPEEnum>[
    androidMobile,
    androidTablet,
    ipad,
    iphone,
    web,
    webMobile,
  ];

  static AppTypeMultipliersAPP_TYPEEnum? fromJson(dynamic value) => AppTypeMultipliersAPP_TYPEEnumTypeTransformer().decode(value);

  static List<AppTypeMultipliersAPP_TYPEEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AppTypeMultipliersAPP_TYPEEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AppTypeMultipliersAPP_TYPEEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AppTypeMultipliersAPP_TYPEEnum] to String,
/// and [decode] dynamic data back to [AppTypeMultipliersAPP_TYPEEnum].
class AppTypeMultipliersAPP_TYPEEnumTypeTransformer {
  factory AppTypeMultipliersAPP_TYPEEnumTypeTransformer() => _instance ??= const AppTypeMultipliersAPP_TYPEEnumTypeTransformer._();

  const AppTypeMultipliersAPP_TYPEEnumTypeTransformer._();

  String encode(AppTypeMultipliersAPP_TYPEEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AppTypeMultipliersAPP_TYPEEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AppTypeMultipliersAPP_TYPEEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'android_mobile': return AppTypeMultipliersAPP_TYPEEnum.androidMobile;
        case r'android_tablet': return AppTypeMultipliersAPP_TYPEEnum.androidTablet;
        case r'ipad': return AppTypeMultipliersAPP_TYPEEnum.ipad;
        case r'iphone': return AppTypeMultipliersAPP_TYPEEnum.iphone;
        case r'web': return AppTypeMultipliersAPP_TYPEEnum.web;
        case r'web_mobile': return AppTypeMultipliersAPP_TYPEEnum.webMobile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AppTypeMultipliersAPP_TYPEEnumTypeTransformer] instance.
  static AppTypeMultipliersAPP_TYPEEnumTypeTransformer? _instance;
}


