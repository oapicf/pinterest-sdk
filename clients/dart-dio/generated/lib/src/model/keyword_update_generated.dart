//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'keyword_update_generated.g.dart';

/// KeywordUpdateGenerated
///
/// Properties:
/// * [archived] - Is keyword archived?
/// * [bid] - </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
/// * [id] - Keyword ID.
@BuiltValue()
abstract class KeywordUpdateGenerated implements Built<KeywordUpdateGenerated, KeywordUpdateGeneratedBuilder> {
  /// Is keyword archived?
  @BuiltValueField(wireName: r'archived')
  bool? get archived;

  /// </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  @BuiltValueField(wireName: r'bid')
  int? get bid;

  /// Keyword ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  KeywordUpdateGenerated._();

  factory KeywordUpdateGenerated([void updates(KeywordUpdateGeneratedBuilder b)]) = _$KeywordUpdateGenerated;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(KeywordUpdateGeneratedBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<KeywordUpdateGenerated> get serializer => _$KeywordUpdateGeneratedSerializer();
}

class _$KeywordUpdateGeneratedSerializer implements PrimitiveSerializer<KeywordUpdateGenerated> {
  @override
  final Iterable<Type> types = const [KeywordUpdateGenerated, _$KeywordUpdateGenerated];

  @override
  final String wireName = r'KeywordUpdateGenerated';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    KeywordUpdateGenerated object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.archived != null) {
      yield r'archived';
      yield serializers.serialize(
        object.archived,
        specifiedType: const FullType(bool),
      );
    }
    if (object.bid != null) {
      yield r'bid';
      yield serializers.serialize(
        object.bid,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    KeywordUpdateGenerated object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required KeywordUpdateGeneratedBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'archived':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.archived = valueDes;
          break;
        case r'bid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bid = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  KeywordUpdateGenerated deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = KeywordUpdateGeneratedBuilder();
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

