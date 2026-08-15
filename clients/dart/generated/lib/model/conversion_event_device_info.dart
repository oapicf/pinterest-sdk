//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEventDeviceInfo {
  /// Returns a new [ConversionEventDeviceInfo] instance.
  ConversionEventDeviceInfo({
    this.batteryLevel,
    this.brand,
    this.carrier,
    this.cpuCores,
    this.externalStorageFreeSpace,
    this.externalStorageSize,
    this.formFactor,
    this.kernelVersion,
    this.languages = const [],
    this.locale,
    this.model,
    this.networkType,
    this.osFamily,
    this.osName,
    this.osReleaseName,
    this.osVersion,
    this.screenDensity,
    this.screenHeight,
    this.screenWidth,
    this.storageFreeSpace,
    this.storageSize,
    this.timezone,
    this.timezoneAbbr,
    this.type,
  });

  /// Battery charge level percentage
  ///
  /// Minimum value: 0
  /// Maximum value: 100
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? batteryLevel;

  /// Device brand
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? brand;

  /// User device's mobile carrier.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? carrier;

  /// Number of CPU cores
  ///
  /// Minimum value: 0
  /// Maximum value: 1152
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? cpuCores;

  /// External storage size in GB
  ///
  /// Minimum value: 0
  /// Maximum value: 1048576
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? externalStorageFreeSpace;

  /// External storage size in GB
  ///
  /// Minimum value: 0
  /// Maximum value: 1048576
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? externalStorageSize;

  /// Device form factor
  ConversionEventDeviceInfoFormFactorEnum? formFactor;

  /// Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? kernelVersion;

  /// List of user installed languages. ISO 639-1 format
  List<String> languages;

  /// Device locale BCP-47 format
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? locale;

  /// Device model name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? model;

  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  ConversionEventDeviceInfoNetworkTypeEnum? networkType;

  /// OS Family
  ConversionEventDeviceInfoOsFamilyEnum? osFamily;

  /// Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? osName;

  /// Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? osReleaseName;

  /// Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? osVersion;

  /// Screen density, PPI
  ///
  /// Minimum value: 0
  /// Maximum value: 100000
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? screenDensity;

  /// Screen height in pixels
  ///
  /// Minimum value: 0
  /// Maximum value: 30720
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? screenHeight;

  /// Screen width in pixels
  ///
  /// Minimum value: 0
  /// Maximum value: 30720
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? screenWidth;

  /// Internal storage size in GB
  ///
  /// Minimum value: 0
  /// Maximum value: 1048576
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? storageFreeSpace;

  /// Internal storage size in GB
  ///
  /// Minimum value: 0
  /// Maximum value: 1048576
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? storageSize;

  /// Device timezone
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? timezone;

  /// Timezone abbreviation
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? timezoneAbbr;

  /// Device type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEventDeviceInfo &&
    other.batteryLevel == batteryLevel &&
    other.brand == brand &&
    other.carrier == carrier &&
    other.cpuCores == cpuCores &&
    other.externalStorageFreeSpace == externalStorageFreeSpace &&
    other.externalStorageSize == externalStorageSize &&
    other.formFactor == formFactor &&
    other.kernelVersion == kernelVersion &&
    _deepEquality.equals(other.languages, languages) &&
    other.locale == locale &&
    other.model == model &&
    other.networkType == networkType &&
    other.osFamily == osFamily &&
    other.osName == osName &&
    other.osReleaseName == osReleaseName &&
    other.osVersion == osVersion &&
    other.screenDensity == screenDensity &&
    other.screenHeight == screenHeight &&
    other.screenWidth == screenWidth &&
    other.storageFreeSpace == storageFreeSpace &&
    other.storageSize == storageSize &&
    other.timezone == timezone &&
    other.timezoneAbbr == timezoneAbbr &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (batteryLevel == null ? 0 : batteryLevel!.hashCode) +
    (brand == null ? 0 : brand!.hashCode) +
    (carrier == null ? 0 : carrier!.hashCode) +
    (cpuCores == null ? 0 : cpuCores!.hashCode) +
    (externalStorageFreeSpace == null ? 0 : externalStorageFreeSpace!.hashCode) +
    (externalStorageSize == null ? 0 : externalStorageSize!.hashCode) +
    (formFactor == null ? 0 : formFactor!.hashCode) +
    (kernelVersion == null ? 0 : kernelVersion!.hashCode) +
    (languages.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (model == null ? 0 : model!.hashCode) +
    (networkType == null ? 0 : networkType!.hashCode) +
    (osFamily == null ? 0 : osFamily!.hashCode) +
    (osName == null ? 0 : osName!.hashCode) +
    (osReleaseName == null ? 0 : osReleaseName!.hashCode) +
    (osVersion == null ? 0 : osVersion!.hashCode) +
    (screenDensity == null ? 0 : screenDensity!.hashCode) +
    (screenHeight == null ? 0 : screenHeight!.hashCode) +
    (screenWidth == null ? 0 : screenWidth!.hashCode) +
    (storageFreeSpace == null ? 0 : storageFreeSpace!.hashCode) +
    (storageSize == null ? 0 : storageSize!.hashCode) +
    (timezone == null ? 0 : timezone!.hashCode) +
    (timezoneAbbr == null ? 0 : timezoneAbbr!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'ConversionEventDeviceInfo[batteryLevel=$batteryLevel, brand=$brand, carrier=$carrier, cpuCores=$cpuCores, externalStorageFreeSpace=$externalStorageFreeSpace, externalStorageSize=$externalStorageSize, formFactor=$formFactor, kernelVersion=$kernelVersion, languages=$languages, locale=$locale, model=$model, networkType=$networkType, osFamily=$osFamily, osName=$osName, osReleaseName=$osReleaseName, osVersion=$osVersion, screenDensity=$screenDensity, screenHeight=$screenHeight, screenWidth=$screenWidth, storageFreeSpace=$storageFreeSpace, storageSize=$storageSize, timezone=$timezone, timezoneAbbr=$timezoneAbbr, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.batteryLevel != null) {
      json[r'battery_level'] = this.batteryLevel;
    } else {
      json[r'battery_level'] = null;
    }
    if (this.brand != null) {
      json[r'brand'] = this.brand;
    } else {
      json[r'brand'] = null;
    }
    if (this.carrier != null) {
      json[r'carrier'] = this.carrier;
    } else {
      json[r'carrier'] = null;
    }
    if (this.cpuCores != null) {
      json[r'cpu_cores'] = this.cpuCores;
    } else {
      json[r'cpu_cores'] = null;
    }
    if (this.externalStorageFreeSpace != null) {
      json[r'external_storage_free_space'] = this.externalStorageFreeSpace;
    } else {
      json[r'external_storage_free_space'] = null;
    }
    if (this.externalStorageSize != null) {
      json[r'external_storage_size'] = this.externalStorageSize;
    } else {
      json[r'external_storage_size'] = null;
    }
    if (this.formFactor != null) {
      json[r'form_factor'] = this.formFactor;
    } else {
      json[r'form_factor'] = null;
    }
    if (this.kernelVersion != null) {
      json[r'kernel_version'] = this.kernelVersion;
    } else {
      json[r'kernel_version'] = null;
    }
      json[r'languages'] = this.languages;
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    if (this.model != null) {
      json[r'model'] = this.model;
    } else {
      json[r'model'] = null;
    }
    if (this.networkType != null) {
      json[r'network_type'] = this.networkType;
    } else {
      json[r'network_type'] = null;
    }
    if (this.osFamily != null) {
      json[r'os_family'] = this.osFamily;
    } else {
      json[r'os_family'] = null;
    }
    if (this.osName != null) {
      json[r'os_name'] = this.osName;
    } else {
      json[r'os_name'] = null;
    }
    if (this.osReleaseName != null) {
      json[r'os_release_name'] = this.osReleaseName;
    } else {
      json[r'os_release_name'] = null;
    }
    if (this.osVersion != null) {
      json[r'os_version'] = this.osVersion;
    } else {
      json[r'os_version'] = null;
    }
    if (this.screenDensity != null) {
      json[r'screen_density'] = this.screenDensity;
    } else {
      json[r'screen_density'] = null;
    }
    if (this.screenHeight != null) {
      json[r'screen_height'] = this.screenHeight;
    } else {
      json[r'screen_height'] = null;
    }
    if (this.screenWidth != null) {
      json[r'screen_width'] = this.screenWidth;
    } else {
      json[r'screen_width'] = null;
    }
    if (this.storageFreeSpace != null) {
      json[r'storage_free_space'] = this.storageFreeSpace;
    } else {
      json[r'storage_free_space'] = null;
    }
    if (this.storageSize != null) {
      json[r'storage_size'] = this.storageSize;
    } else {
      json[r'storage_size'] = null;
    }
    if (this.timezone != null) {
      json[r'timezone'] = this.timezone;
    } else {
      json[r'timezone'] = null;
    }
    if (this.timezoneAbbr != null) {
      json[r'timezone_abbr'] = this.timezoneAbbr;
    } else {
      json[r'timezone_abbr'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionEventDeviceInfo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEventDeviceInfo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionEventDeviceInfo[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionEventDeviceInfo[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionEventDeviceInfo(
        batteryLevel: mapValueOfType<int>(json, r'battery_level'),
        brand: mapValueOfType<String>(json, r'brand'),
        carrier: mapValueOfType<String>(json, r'carrier'),
        cpuCores: mapValueOfType<int>(json, r'cpu_cores'),
        externalStorageFreeSpace: mapValueOfType<int>(json, r'external_storage_free_space'),
        externalStorageSize: mapValueOfType<int>(json, r'external_storage_size'),
        formFactor: ConversionEventDeviceInfoFormFactorEnum.fromJson(json[r'form_factor']),
        kernelVersion: mapValueOfType<String>(json, r'kernel_version'),
        languages: json[r'languages'] is Iterable
            ? (json[r'languages'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        locale: mapValueOfType<String>(json, r'locale'),
        model: mapValueOfType<String>(json, r'model'),
        networkType: ConversionEventDeviceInfoNetworkTypeEnum.fromJson(json[r'network_type']),
        osFamily: ConversionEventDeviceInfoOsFamilyEnum.fromJson(json[r'os_family']),
        osName: mapValueOfType<String>(json, r'os_name'),
        osReleaseName: mapValueOfType<String>(json, r'os_release_name'),
        osVersion: mapValueOfType<String>(json, r'os_version'),
        screenDensity: mapValueOfType<int>(json, r'screen_density'),
        screenHeight: mapValueOfType<int>(json, r'screen_height'),
        screenWidth: mapValueOfType<int>(json, r'screen_width'),
        storageFreeSpace: mapValueOfType<int>(json, r'storage_free_space'),
        storageSize: mapValueOfType<int>(json, r'storage_size'),
        timezone: mapValueOfType<String>(json, r'timezone'),
        timezoneAbbr: mapValueOfType<String>(json, r'timezone_abbr'),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<ConversionEventDeviceInfo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventDeviceInfo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventDeviceInfo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEventDeviceInfo> mapFromJson(dynamic json) {
    final map = <String, ConversionEventDeviceInfo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEventDeviceInfo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEventDeviceInfo-objects as value to a dart map
  static Map<String, List<ConversionEventDeviceInfo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEventDeviceInfo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEventDeviceInfo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Device form factor
class ConversionEventDeviceInfoFormFactorEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionEventDeviceInfoFormFactorEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const desktop = ConversionEventDeviceInfoFormFactorEnum._(r'desktop');
  static const laptop = ConversionEventDeviceInfoFormFactorEnum._(r'laptop');
  static const cellphone = ConversionEventDeviceInfoFormFactorEnum._(r'cellphone');
  static const tablet = ConversionEventDeviceInfoFormFactorEnum._(r'tablet');
  static const smartwatch = ConversionEventDeviceInfoFormFactorEnum._(r'smartwatch');
  static const tv = ConversionEventDeviceInfoFormFactorEnum._(r'tv');
  static const vr = ConversionEventDeviceInfoFormFactorEnum._(r'vr');
  static const console = ConversionEventDeviceInfoFormFactorEnum._(r'console');
  static const other = ConversionEventDeviceInfoFormFactorEnum._(r'other');

  /// List of all possible values in this [enum][ConversionEventDeviceInfoFormFactorEnum].
  static const values = <ConversionEventDeviceInfoFormFactorEnum>[
    desktop,
    laptop,
    cellphone,
    tablet,
    smartwatch,
    tv,
    vr,
    console,
    other,
  ];

  static ConversionEventDeviceInfoFormFactorEnum? fromJson(dynamic value) => ConversionEventDeviceInfoFormFactorEnumTypeTransformer().decode(value);

  static List<ConversionEventDeviceInfoFormFactorEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventDeviceInfoFormFactorEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventDeviceInfoFormFactorEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionEventDeviceInfoFormFactorEnum] to String,
/// and [decode] dynamic data back to [ConversionEventDeviceInfoFormFactorEnum].
class ConversionEventDeviceInfoFormFactorEnumTypeTransformer {
  factory ConversionEventDeviceInfoFormFactorEnumTypeTransformer() => _instance ??= const ConversionEventDeviceInfoFormFactorEnumTypeTransformer._();

  const ConversionEventDeviceInfoFormFactorEnumTypeTransformer._();

  String encode(ConversionEventDeviceInfoFormFactorEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionEventDeviceInfoFormFactorEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionEventDeviceInfoFormFactorEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'desktop': return ConversionEventDeviceInfoFormFactorEnum.desktop;
        case r'laptop': return ConversionEventDeviceInfoFormFactorEnum.laptop;
        case r'cellphone': return ConversionEventDeviceInfoFormFactorEnum.cellphone;
        case r'tablet': return ConversionEventDeviceInfoFormFactorEnum.tablet;
        case r'smartwatch': return ConversionEventDeviceInfoFormFactorEnum.smartwatch;
        case r'tv': return ConversionEventDeviceInfoFormFactorEnum.tv;
        case r'vr': return ConversionEventDeviceInfoFormFactorEnum.vr;
        case r'console': return ConversionEventDeviceInfoFormFactorEnum.console;
        case r'other': return ConversionEventDeviceInfoFormFactorEnum.other;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionEventDeviceInfoFormFactorEnumTypeTransformer] instance.
  static ConversionEventDeviceInfoFormFactorEnumTypeTransformer? _instance;
}


/// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
class ConversionEventDeviceInfoNetworkTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionEventDeviceInfoNetworkTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const wifi = ConversionEventDeviceInfoNetworkTypeEnum._(r'wifi');
  static const cellular2g = ConversionEventDeviceInfoNetworkTypeEnum._(r'cellular_2g');
  static const cellular3g = ConversionEventDeviceInfoNetworkTypeEnum._(r'cellular_3g');
  static const cellular4g = ConversionEventDeviceInfoNetworkTypeEnum._(r'cellular_4g');
  static const cellular5g = ConversionEventDeviceInfoNetworkTypeEnum._(r'cellular_5g');
  static const cellular6g = ConversionEventDeviceInfoNetworkTypeEnum._(r'cellular_6g');
  static const ethernet = ConversionEventDeviceInfoNetworkTypeEnum._(r'ethernet');
  static const unknown = ConversionEventDeviceInfoNetworkTypeEnum._(r'unknown');

  /// List of all possible values in this [enum][ConversionEventDeviceInfoNetworkTypeEnum].
  static const values = <ConversionEventDeviceInfoNetworkTypeEnum>[
    wifi,
    cellular2g,
    cellular3g,
    cellular4g,
    cellular5g,
    cellular6g,
    ethernet,
    unknown,
  ];

  static ConversionEventDeviceInfoNetworkTypeEnum? fromJson(dynamic value) => ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer().decode(value);

  static List<ConversionEventDeviceInfoNetworkTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventDeviceInfoNetworkTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventDeviceInfoNetworkTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionEventDeviceInfoNetworkTypeEnum] to String,
/// and [decode] dynamic data back to [ConversionEventDeviceInfoNetworkTypeEnum].
class ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer {
  factory ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer() => _instance ??= const ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer._();

  const ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer._();

  String encode(ConversionEventDeviceInfoNetworkTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionEventDeviceInfoNetworkTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionEventDeviceInfoNetworkTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'wifi': return ConversionEventDeviceInfoNetworkTypeEnum.wifi;
        case r'cellular_2g': return ConversionEventDeviceInfoNetworkTypeEnum.cellular2g;
        case r'cellular_3g': return ConversionEventDeviceInfoNetworkTypeEnum.cellular3g;
        case r'cellular_4g': return ConversionEventDeviceInfoNetworkTypeEnum.cellular4g;
        case r'cellular_5g': return ConversionEventDeviceInfoNetworkTypeEnum.cellular5g;
        case r'cellular_6g': return ConversionEventDeviceInfoNetworkTypeEnum.cellular6g;
        case r'ethernet': return ConversionEventDeviceInfoNetworkTypeEnum.ethernet;
        case r'unknown': return ConversionEventDeviceInfoNetworkTypeEnum.unknown;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer] instance.
  static ConversionEventDeviceInfoNetworkTypeEnumTypeTransformer? _instance;
}


/// OS Family
class ConversionEventDeviceInfoOsFamilyEnum {
  /// Instantiate a new enum with the provided [value].
  const ConversionEventDeviceInfoOsFamilyEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ios = ConversionEventDeviceInfoOsFamilyEnum._(r'ios');
  static const android = ConversionEventDeviceInfoOsFamilyEnum._(r'android');
  static const macos = ConversionEventDeviceInfoOsFamilyEnum._(r'macos');
  static const windows = ConversionEventDeviceInfoOsFamilyEnum._(r'windows');
  static const linux = ConversionEventDeviceInfoOsFamilyEnum._(r'linux');
  static const bsd = ConversionEventDeviceInfoOsFamilyEnum._(r'bsd');
  static const other = ConversionEventDeviceInfoOsFamilyEnum._(r'other');

  /// List of all possible values in this [enum][ConversionEventDeviceInfoOsFamilyEnum].
  static const values = <ConversionEventDeviceInfoOsFamilyEnum>[
    ios,
    android,
    macos,
    windows,
    linux,
    bsd,
    other,
  ];

  static ConversionEventDeviceInfoOsFamilyEnum? fromJson(dynamic value) => ConversionEventDeviceInfoOsFamilyEnumTypeTransformer().decode(value);

  static List<ConversionEventDeviceInfoOsFamilyEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEventDeviceInfoOsFamilyEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEventDeviceInfoOsFamilyEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionEventDeviceInfoOsFamilyEnum] to String,
/// and [decode] dynamic data back to [ConversionEventDeviceInfoOsFamilyEnum].
class ConversionEventDeviceInfoOsFamilyEnumTypeTransformer {
  factory ConversionEventDeviceInfoOsFamilyEnumTypeTransformer() => _instance ??= const ConversionEventDeviceInfoOsFamilyEnumTypeTransformer._();

  const ConversionEventDeviceInfoOsFamilyEnumTypeTransformer._();

  String encode(ConversionEventDeviceInfoOsFamilyEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionEventDeviceInfoOsFamilyEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionEventDeviceInfoOsFamilyEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ios': return ConversionEventDeviceInfoOsFamilyEnum.ios;
        case r'android': return ConversionEventDeviceInfoOsFamilyEnum.android;
        case r'macos': return ConversionEventDeviceInfoOsFamilyEnum.macos;
        case r'windows': return ConversionEventDeviceInfoOsFamilyEnum.windows;
        case r'linux': return ConversionEventDeviceInfoOsFamilyEnum.linux;
        case r'bsd': return ConversionEventDeviceInfoOsFamilyEnum.bsd;
        case r'other': return ConversionEventDeviceInfoOsFamilyEnum.other;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionEventDeviceInfoOsFamilyEnumTypeTransformer] instance.
  static ConversionEventDeviceInfoOsFamilyEnumTypeTransformer? _instance;
}


