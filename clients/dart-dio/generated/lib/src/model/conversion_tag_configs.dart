//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_configs.g.dart';

/// ConversionTagConfigs
///
/// Properties:
/// * [aemDbEnabled] - Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemEnabled] - Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemExternalIdEnabled] - Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemFnlnEnabled] - Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemGeEnabled] - Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemLocEnabled] - Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [aemPhEnabled] - Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
/// * [mdFrequency] - Metadata ingestion frequency.
/// * [noCodeCapiDomains] - List of advertiser subdomains configured for NoCodeCAPI calls.
@BuiltValue()
abstract class ConversionTagConfigs implements Built<ConversionTagConfigs, ConversionTagConfigsBuilder> {
  /// Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_db_enabled')
  bool? get aemDbEnabled;

  /// Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_enabled')
  bool? get aemEnabled;

  /// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_external_id_enabled')
  bool? get aemExternalIdEnabled;

  /// Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_fnln_enabled')
  bool? get aemFnlnEnabled;

  /// Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_ge_enabled')
  bool? get aemGeEnabled;

  /// Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_loc_enabled')
  bool? get aemLocEnabled;

  /// Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information.
  @BuiltValueField(wireName: r'aem_ph_enabled')
  bool? get aemPhEnabled;

  /// Metadata ingestion frequency.
  @BuiltValueField(wireName: r'md_frequency')
  num? get mdFrequency;

  /// List of advertiser subdomains configured for NoCodeCAPI calls.
  @BuiltValueField(wireName: r'no_code_capi_domains')
  BuiltList<String>? get noCodeCapiDomains;

  ConversionTagConfigs._();

  factory ConversionTagConfigs([void updates(ConversionTagConfigsBuilder b)]) = _$ConversionTagConfigs;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagConfigsBuilder b) => b
      ..aemDbEnabled = false
      ..aemEnabled = false
      ..aemExternalIdEnabled = false
      ..aemFnlnEnabled = false
      ..aemGeEnabled = false
      ..aemLocEnabled = false
      ..aemPhEnabled = false
      ..mdFrequency = 1;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagConfigs> get serializer => _$ConversionTagConfigsSerializer();
}

class _$ConversionTagConfigsSerializer implements PrimitiveSerializer<ConversionTagConfigs> {
  @override
  final Iterable<Type> types = const [ConversionTagConfigs, _$ConversionTagConfigs];

  @override
  final String wireName = r'ConversionTagConfigs';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagConfigs object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.aemDbEnabled != null) {
      yield r'aem_db_enabled';
      yield serializers.serialize(
        object.aemDbEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemEnabled != null) {
      yield r'aem_enabled';
      yield serializers.serialize(
        object.aemEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemExternalIdEnabled != null) {
      yield r'aem_external_id_enabled';
      yield serializers.serialize(
        object.aemExternalIdEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemFnlnEnabled != null) {
      yield r'aem_fnln_enabled';
      yield serializers.serialize(
        object.aemFnlnEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemGeEnabled != null) {
      yield r'aem_ge_enabled';
      yield serializers.serialize(
        object.aemGeEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemLocEnabled != null) {
      yield r'aem_loc_enabled';
      yield serializers.serialize(
        object.aemLocEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.aemPhEnabled != null) {
      yield r'aem_ph_enabled';
      yield serializers.serialize(
        object.aemPhEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.mdFrequency != null) {
      yield r'md_frequency';
      yield serializers.serialize(
        object.mdFrequency,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.noCodeCapiDomains != null) {
      yield r'no_code_capi_domains';
      yield serializers.serialize(
        object.noCodeCapiDomains,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagConfigs object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagConfigsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'aem_db_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemDbEnabled = valueDes;
          break;
        case r'aem_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemEnabled = valueDes;
          break;
        case r'aem_external_id_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemExternalIdEnabled = valueDes;
          break;
        case r'aem_fnln_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemFnlnEnabled = valueDes;
          break;
        case r'aem_ge_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemGeEnabled = valueDes;
          break;
        case r'aem_loc_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemLocEnabled = valueDes;
          break;
        case r'aem_ph_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.aemPhEnabled = valueDes;
          break;
        case r'md_frequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.mdFrequency = valueDes;
          break;
        case r'no_code_capi_domains':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.noCodeCapiDomains.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionTagConfigs deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagConfigsBuilder();
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

