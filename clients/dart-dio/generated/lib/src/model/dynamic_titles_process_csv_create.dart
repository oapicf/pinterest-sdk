//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_process_csv_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [requestId] - The request_id returned from the GET uploads endpoint.
@BuiltValue()
abstract class DynamicTitlesProcessCSVCreate implements Built<DynamicTitlesProcessCSVCreate, DynamicTitlesProcessCSVCreateBuilder> {
  /// The request_id returned from the GET uploads endpoint.
  @BuiltValueField(wireName: r'request_id')
  String get requestId;

  DynamicTitlesProcessCSVCreate._();

  factory DynamicTitlesProcessCSVCreate([void updates(DynamicTitlesProcessCSVCreateBuilder b)]) = _$DynamicTitlesProcessCSVCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesProcessCSVCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesProcessCSVCreate> get serializer => _$DynamicTitlesProcessCSVCreateSerializer();
}

class _$DynamicTitlesProcessCSVCreateSerializer implements PrimitiveSerializer<DynamicTitlesProcessCSVCreate> {
  @override
  final Iterable<Type> types = const [DynamicTitlesProcessCSVCreate, _$DynamicTitlesProcessCSVCreate];

  @override
  final String wireName = r'DynamicTitlesProcessCSVCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesProcessCSVCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'request_id';
    yield serializers.serialize(
      object.requestId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesProcessCSVCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesProcessCSVCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'request_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.requestId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesProcessCSVCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesProcessCSVCreateBuilder();
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

