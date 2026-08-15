//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_create.g.dart';

/// Resource create operation model.
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
/// * [name] - Conversion tag name.
@BuiltValue()
abstract class ConversionTagCreate implements Built<ConversionTagCreate, ConversionTagCreateBuilder> {
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

  /// Conversion tag name.
  @BuiltValueField(wireName: r'name')
  String get name;

  ConversionTagCreate._();

  factory ConversionTagCreate([void updates(ConversionTagCreateBuilder b)]) = _$ConversionTagCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionTagCreateBuilder b) => b
      ..aemDbEnabled = false
      ..aemEnabled = false
      ..aemExternalIdEnabled = false
      ..aemFnlnEnabled = false
      ..aemGeEnabled = false
      ..aemLocEnabled = false
      ..aemPhEnabled = false
      ..mdFrequency = 1;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionTagCreate> get serializer => _$ConversionTagCreateSerializer();
}

class _$ConversionTagCreateSerializer implements PrimitiveSerializer<ConversionTagCreate> {
  @override
  final Iterable<Type> types = const [ConversionTagCreate, _$ConversionTagCreate];

  @override
  final String wireName = r'ConversionTagCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionTagCreate object, {
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
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionTagCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionTagCreateBuilder result,
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionTagCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionTagCreateBuilder();
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

