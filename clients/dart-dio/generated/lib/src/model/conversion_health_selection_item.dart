//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_health_selection_item.g.dart';

/// User selection of conversion health criteria for a single feature
///
/// Properties:
/// * [conversionType] - Status for conversion types
/// * [criteria] - Status for criteria
/// * [ingestionSource] - Status for ingestion sources
/// * [status] - Overall status for this selection item
@BuiltValue()
abstract class ConversionHealthSelectionItem implements Built<ConversionHealthSelectionItem, ConversionHealthSelectionItemBuilder> {
  /// Status for conversion types
  @BuiltValueField(wireName: r'conversionType')
  JsonObject? get conversionType;

  /// Status for criteria
  @BuiltValueField(wireName: r'criteria')
  JsonObject? get criteria;

  /// Status for ingestion sources
  @BuiltValueField(wireName: r'ingestionSource')
  JsonObject? get ingestionSource;

  /// Overall status for this selection item
  @BuiltValueField(wireName: r'status')
  JsonObject? get status;

  ConversionHealthSelectionItem._();

  factory ConversionHealthSelectionItem([void updates(ConversionHealthSelectionItemBuilder b)]) = _$ConversionHealthSelectionItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionHealthSelectionItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionHealthSelectionItem> get serializer => _$ConversionHealthSelectionItemSerializer();
}

class _$ConversionHealthSelectionItemSerializer implements PrimitiveSerializer<ConversionHealthSelectionItem> {
  @override
  final Iterable<Type> types = const [ConversionHealthSelectionItem, _$ConversionHealthSelectionItem];

  @override
  final String wireName = r'ConversionHealthSelectionItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionHealthSelectionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.conversionType != null) {
      yield r'conversionType';
      yield serializers.serialize(
        object.conversionType,
        specifiedType: const FullType(JsonObject),
      );
    }
    if (object.criteria != null) {
      yield r'criteria';
      yield serializers.serialize(
        object.criteria,
        specifiedType: const FullType(JsonObject),
      );
    }
    if (object.ingestionSource != null) {
      yield r'ingestionSource';
      yield serializers.serialize(
        object.ingestionSource,
        specifiedType: const FullType(JsonObject),
      );
    }
    yield r'status';
    yield object.status == null ? null : serializers.serialize(
      object.status,
      specifiedType: const FullType.nullable(JsonObject),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionHealthSelectionItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionHealthSelectionItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'conversionType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.conversionType = valueDes;
          break;
        case r'criteria':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.criteria = valueDes;
          break;
        case r'ingestionSource':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.ingestionSource = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionHealthSelectionItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionHealthSelectionItemBuilder();
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

