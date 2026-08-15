//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_event_device_info.g.dart';

/// Object containing information about the device where event occurred.
///
/// Properties:
/// * [batteryLevel] - Battery charge level percentage
/// * [brand] - Device brand
/// * [carrier] - User device's mobile carrier.
/// * [cpuCores] - Number of CPU cores
/// * [externalStorageFreeSpace] - External storage size in GB
/// * [externalStorageSize] - External storage size in GB
/// * [formFactor] - Device form factor
/// * [kernelVersion] - Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
/// * [languages] - List of user installed languages. ISO 639-1 format
/// * [locale] - Device locale BCP-47 format
/// * [model] - Device model name
/// * [networkType] - Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
/// * [osFamily] - OS Family
/// * [osName] - Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
/// * [osReleaseName] - Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
/// * [osVersion] - Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
/// * [screenDensity] - Screen density, PPI
/// * [screenHeight] - Screen height in pixels
/// * [screenWidth] - Screen width in pixels
/// * [storageFreeSpace] - Internal storage size in GB
/// * [storageSize] - Internal storage size in GB
/// * [timezone] - Device timezone
/// * [timezoneAbbr] - Timezone abbreviation
/// * [type] - Device type
@BuiltValue()
abstract class ConversionEventDeviceInfo implements Built<ConversionEventDeviceInfo, ConversionEventDeviceInfoBuilder> {
  /// Battery charge level percentage
  @BuiltValueField(wireName: r'battery_level')
  int? get batteryLevel;

  /// Device brand
  @BuiltValueField(wireName: r'brand')
  String? get brand;

  /// User device's mobile carrier.
  @BuiltValueField(wireName: r'carrier')
  String? get carrier;

  /// Number of CPU cores
  @BuiltValueField(wireName: r'cpu_cores')
  int? get cpuCores;

  /// External storage size in GB
  @BuiltValueField(wireName: r'external_storage_free_space')
  int? get externalStorageFreeSpace;

  /// External storage size in GB
  @BuiltValueField(wireName: r'external_storage_size')
  int? get externalStorageSize;

  /// Device form factor
  @BuiltValueField(wireName: r'form_factor')
  ConversionEventDeviceInfoFormFactorEnum? get formFactor;
  // enum formFactorEnum {  desktop,  laptop,  cellphone,  tablet,  smartwatch,  tv,  vr,  console,  other,  };

  /// Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
  @BuiltValueField(wireName: r'kernel_version')
  String? get kernelVersion;

  /// List of user installed languages. ISO 639-1 format
  @BuiltValueField(wireName: r'languages')
  BuiltList<String>? get languages;

  /// Device locale BCP-47 format
  @BuiltValueField(wireName: r'locale')
  String? get locale;

  /// Device model name
  @BuiltValueField(wireName: r'model')
  String? get model;

  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueField(wireName: r'network_type')
  ConversionEventDeviceInfoNetworkTypeEnum? get networkType;
  // enum networkTypeEnum {  wifi,  cellular_2g,  cellular_3g,  cellular_4g,  cellular_5g,  cellular_6g,  ethernet,  unknown,  };

  /// OS Family
  @BuiltValueField(wireName: r'os_family')
  ConversionEventDeviceInfoOsFamilyEnum? get osFamily;
  // enum osFamilyEnum {  ios,  android,  macos,  windows,  linux,  bsd,  other,  };

  /// Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
  @BuiltValueField(wireName: r'os_name')
  String? get osName;

  /// Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
  @BuiltValueField(wireName: r'os_release_name')
  String? get osReleaseName;

  /// Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
  @BuiltValueField(wireName: r'os_version')
  String? get osVersion;

  /// Screen density, PPI
  @BuiltValueField(wireName: r'screen_density')
  int? get screenDensity;

  /// Screen height in pixels
  @BuiltValueField(wireName: r'screen_height')
  int? get screenHeight;

  /// Screen width in pixels
  @BuiltValueField(wireName: r'screen_width')
  int? get screenWidth;

  /// Internal storage size in GB
  @BuiltValueField(wireName: r'storage_free_space')
  int? get storageFreeSpace;

  /// Internal storage size in GB
  @BuiltValueField(wireName: r'storage_size')
  int? get storageSize;

  /// Device timezone
  @BuiltValueField(wireName: r'timezone')
  String? get timezone;

  /// Timezone abbreviation
  @BuiltValueField(wireName: r'timezone_abbr')
  String? get timezoneAbbr;

  /// Device type
  @BuiltValueField(wireName: r'type')
  String? get type;

  ConversionEventDeviceInfo._();

  factory ConversionEventDeviceInfo([void updates(ConversionEventDeviceInfoBuilder b)]) = _$ConversionEventDeviceInfo;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventDeviceInfoBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventDeviceInfo> get serializer => _$ConversionEventDeviceInfoSerializer();
}

class _$ConversionEventDeviceInfoSerializer implements PrimitiveSerializer<ConversionEventDeviceInfo> {
  @override
  final Iterable<Type> types = const [ConversionEventDeviceInfo, _$ConversionEventDeviceInfo];

  @override
  final String wireName = r'ConversionEventDeviceInfo';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventDeviceInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.batteryLevel != null) {
      yield r'battery_level';
      yield serializers.serialize(
        object.batteryLevel,
        specifiedType: const FullType(int),
      );
    }
    if (object.brand != null) {
      yield r'brand';
      yield serializers.serialize(
        object.brand,
        specifiedType: const FullType(String),
      );
    }
    if (object.carrier != null) {
      yield r'carrier';
      yield serializers.serialize(
        object.carrier,
        specifiedType: const FullType(String),
      );
    }
    if (object.cpuCores != null) {
      yield r'cpu_cores';
      yield serializers.serialize(
        object.cpuCores,
        specifiedType: const FullType(int),
      );
    }
    if (object.externalStorageFreeSpace != null) {
      yield r'external_storage_free_space';
      yield serializers.serialize(
        object.externalStorageFreeSpace,
        specifiedType: const FullType(int),
      );
    }
    if (object.externalStorageSize != null) {
      yield r'external_storage_size';
      yield serializers.serialize(
        object.externalStorageSize,
        specifiedType: const FullType(int),
      );
    }
    if (object.formFactor != null) {
      yield r'form_factor';
      yield serializers.serialize(
        object.formFactor,
        specifiedType: const FullType(ConversionEventDeviceInfoFormFactorEnum),
      );
    }
    if (object.kernelVersion != null) {
      yield r'kernel_version';
      yield serializers.serialize(
        object.kernelVersion,
        specifiedType: const FullType(String),
      );
    }
    if (object.languages != null) {
      yield r'languages';
      yield serializers.serialize(
        object.languages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.locale != null) {
      yield r'locale';
      yield serializers.serialize(
        object.locale,
        specifiedType: const FullType(String),
      );
    }
    if (object.model != null) {
      yield r'model';
      yield serializers.serialize(
        object.model,
        specifiedType: const FullType(String),
      );
    }
    if (object.networkType != null) {
      yield r'network_type';
      yield serializers.serialize(
        object.networkType,
        specifiedType: const FullType(ConversionEventDeviceInfoNetworkTypeEnum),
      );
    }
    if (object.osFamily != null) {
      yield r'os_family';
      yield serializers.serialize(
        object.osFamily,
        specifiedType: const FullType(ConversionEventDeviceInfoOsFamilyEnum),
      );
    }
    if (object.osName != null) {
      yield r'os_name';
      yield serializers.serialize(
        object.osName,
        specifiedType: const FullType(String),
      );
    }
    if (object.osReleaseName != null) {
      yield r'os_release_name';
      yield serializers.serialize(
        object.osReleaseName,
        specifiedType: const FullType(String),
      );
    }
    if (object.osVersion != null) {
      yield r'os_version';
      yield serializers.serialize(
        object.osVersion,
        specifiedType: const FullType(String),
      );
    }
    if (object.screenDensity != null) {
      yield r'screen_density';
      yield serializers.serialize(
        object.screenDensity,
        specifiedType: const FullType(int),
      );
    }
    if (object.screenHeight != null) {
      yield r'screen_height';
      yield serializers.serialize(
        object.screenHeight,
        specifiedType: const FullType(int),
      );
    }
    if (object.screenWidth != null) {
      yield r'screen_width';
      yield serializers.serialize(
        object.screenWidth,
        specifiedType: const FullType(int),
      );
    }
    if (object.storageFreeSpace != null) {
      yield r'storage_free_space';
      yield serializers.serialize(
        object.storageFreeSpace,
        specifiedType: const FullType(int),
      );
    }
    if (object.storageSize != null) {
      yield r'storage_size';
      yield serializers.serialize(
        object.storageSize,
        specifiedType: const FullType(int),
      );
    }
    if (object.timezone != null) {
      yield r'timezone';
      yield serializers.serialize(
        object.timezone,
        specifiedType: const FullType(String),
      );
    }
    if (object.timezoneAbbr != null) {
      yield r'timezone_abbr';
      yield serializers.serialize(
        object.timezoneAbbr,
        specifiedType: const FullType(String),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventDeviceInfo object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventDeviceInfoBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'battery_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.batteryLevel = valueDes;
          break;
        case r'brand':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.brand = valueDes;
          break;
        case r'carrier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.carrier = valueDes;
          break;
        case r'cpu_cores':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.cpuCores = valueDes;
          break;
        case r'external_storage_free_space':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.externalStorageFreeSpace = valueDes;
          break;
        case r'external_storage_size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.externalStorageSize = valueDes;
          break;
        case r'form_factor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventDeviceInfoFormFactorEnum),
          ) as ConversionEventDeviceInfoFormFactorEnum;
          result.formFactor = valueDes;
          break;
        case r'kernel_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.kernelVersion = valueDes;
          break;
        case r'languages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.languages.replace(valueDes);
          break;
        case r'locale':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.locale = valueDes;
          break;
        case r'model':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.model = valueDes;
          break;
        case r'network_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventDeviceInfoNetworkTypeEnum),
          ) as ConversionEventDeviceInfoNetworkTypeEnum;
          result.networkType = valueDes;
          break;
        case r'os_family':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionEventDeviceInfoOsFamilyEnum),
          ) as ConversionEventDeviceInfoOsFamilyEnum;
          result.osFamily = valueDes;
          break;
        case r'os_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.osName = valueDes;
          break;
        case r'os_release_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.osReleaseName = valueDes;
          break;
        case r'os_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.osVersion = valueDes;
          break;
        case r'screen_density':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.screenDensity = valueDes;
          break;
        case r'screen_height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.screenHeight = valueDes;
          break;
        case r'screen_width':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.screenWidth = valueDes;
          break;
        case r'storage_free_space':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.storageFreeSpace = valueDes;
          break;
        case r'storage_size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.storageSize = valueDes;
          break;
        case r'timezone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.timezone = valueDes;
          break;
        case r'timezone_abbr':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.timezoneAbbr = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionEventDeviceInfo deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventDeviceInfoBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

class ConversionEventDeviceInfoFormFactorEnum extends EnumClass {

  /// Device form factor
  @BuiltValueEnumConst(wireName: r'desktop')
  static const ConversionEventDeviceInfoFormFactorEnum desktop = _$conversionEventDeviceInfoFormFactorEnum_desktop;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'laptop')
  static const ConversionEventDeviceInfoFormFactorEnum laptop = _$conversionEventDeviceInfoFormFactorEnum_laptop;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'cellphone')
  static const ConversionEventDeviceInfoFormFactorEnum cellphone = _$conversionEventDeviceInfoFormFactorEnum_cellphone;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'tablet')
  static const ConversionEventDeviceInfoFormFactorEnum tablet = _$conversionEventDeviceInfoFormFactorEnum_tablet;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'smartwatch')
  static const ConversionEventDeviceInfoFormFactorEnum smartwatch = _$conversionEventDeviceInfoFormFactorEnum_smartwatch;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'tv')
  static const ConversionEventDeviceInfoFormFactorEnum tv = _$conversionEventDeviceInfoFormFactorEnum_tv;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'vr')
  static const ConversionEventDeviceInfoFormFactorEnum vr = _$conversionEventDeviceInfoFormFactorEnum_vr;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'console')
  static const ConversionEventDeviceInfoFormFactorEnum console = _$conversionEventDeviceInfoFormFactorEnum_console;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'other')
  static const ConversionEventDeviceInfoFormFactorEnum other = _$conversionEventDeviceInfoFormFactorEnum_other;

  static Serializer<ConversionEventDeviceInfoFormFactorEnum> get serializer => _$conversionEventDeviceInfoFormFactorEnumSerializer;

  const ConversionEventDeviceInfoFormFactorEnum._(String name): super(name);

  static BuiltSet<ConversionEventDeviceInfoFormFactorEnum> get values => _$conversionEventDeviceInfoFormFactorEnumValues;
  static ConversionEventDeviceInfoFormFactorEnum valueOf(String name) => _$conversionEventDeviceInfoFormFactorEnumValueOf(name);
}

class ConversionEventDeviceInfoNetworkTypeEnum extends EnumClass {

  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'wifi')
  static const ConversionEventDeviceInfoNetworkTypeEnum wifi = _$conversionEventDeviceInfoNetworkTypeEnum_wifi;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'cellular_2g')
  static const ConversionEventDeviceInfoNetworkTypeEnum cellular2g = _$conversionEventDeviceInfoNetworkTypeEnum_cellular2g;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'cellular_3g')
  static const ConversionEventDeviceInfoNetworkTypeEnum cellular3g = _$conversionEventDeviceInfoNetworkTypeEnum_cellular3g;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'cellular_4g')
  static const ConversionEventDeviceInfoNetworkTypeEnum cellular4g = _$conversionEventDeviceInfoNetworkTypeEnum_cellular4g;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'cellular_5g')
  static const ConversionEventDeviceInfoNetworkTypeEnum cellular5g = _$conversionEventDeviceInfoNetworkTypeEnum_cellular5g;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'cellular_6g')
  static const ConversionEventDeviceInfoNetworkTypeEnum cellular6g = _$conversionEventDeviceInfoNetworkTypeEnum_cellular6g;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'ethernet')
  static const ConversionEventDeviceInfoNetworkTypeEnum ethernet = _$conversionEventDeviceInfoNetworkTypeEnum_ethernet;
  /// Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
  @BuiltValueEnumConst(wireName: r'unknown')
  static const ConversionEventDeviceInfoNetworkTypeEnum unknown = _$conversionEventDeviceInfoNetworkTypeEnum_unknown;

  static Serializer<ConversionEventDeviceInfoNetworkTypeEnum> get serializer => _$conversionEventDeviceInfoNetworkTypeEnumSerializer;

  const ConversionEventDeviceInfoNetworkTypeEnum._(String name): super(name);

  static BuiltSet<ConversionEventDeviceInfoNetworkTypeEnum> get values => _$conversionEventDeviceInfoNetworkTypeEnumValues;
  static ConversionEventDeviceInfoNetworkTypeEnum valueOf(String name) => _$conversionEventDeviceInfoNetworkTypeEnumValueOf(name);
}

class ConversionEventDeviceInfoOsFamilyEnum extends EnumClass {

  /// OS Family
  @BuiltValueEnumConst(wireName: r'ios')
  static const ConversionEventDeviceInfoOsFamilyEnum ios = _$conversionEventDeviceInfoOsFamilyEnum_ios;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'android')
  static const ConversionEventDeviceInfoOsFamilyEnum android = _$conversionEventDeviceInfoOsFamilyEnum_android;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'macos')
  static const ConversionEventDeviceInfoOsFamilyEnum macos = _$conversionEventDeviceInfoOsFamilyEnum_macos;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'windows')
  static const ConversionEventDeviceInfoOsFamilyEnum windows = _$conversionEventDeviceInfoOsFamilyEnum_windows;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'linux')
  static const ConversionEventDeviceInfoOsFamilyEnum linux = _$conversionEventDeviceInfoOsFamilyEnum_linux;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'bsd')
  static const ConversionEventDeviceInfoOsFamilyEnum bsd = _$conversionEventDeviceInfoOsFamilyEnum_bsd;
  /// OS Family
  @BuiltValueEnumConst(wireName: r'other')
  static const ConversionEventDeviceInfoOsFamilyEnum other = _$conversionEventDeviceInfoOsFamilyEnum_other;

  static Serializer<ConversionEventDeviceInfoOsFamilyEnum> get serializer => _$conversionEventDeviceInfoOsFamilyEnumSerializer;

  const ConversionEventDeviceInfoOsFamilyEnum._(String name): super(name);

  static BuiltSet<ConversionEventDeviceInfoOsFamilyEnum> get values => _$conversionEventDeviceInfoOsFamilyEnumValues;
  static ConversionEventDeviceInfoOsFamilyEnum valueOf(String name) => _$conversionEventDeviceInfoOsFamilyEnumValueOf(name);
}

