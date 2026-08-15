//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'metrics_response.g.dart';

/// MetricsResponse
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class MetricsResponse implements Built<MetricsResponse, MetricsResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<JsonObject>? get data;

  MetricsResponse._();

  factory MetricsResponse([void updates(MetricsResponseBuilder b)]) = _$MetricsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MetricsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MetricsResponse> get serializer => _$MetricsResponseSerializer();
}

class _$MetricsResponseSerializer implements PrimitiveSerializer<MetricsResponse> {
  @override
  final Iterable<Type> types = const [MetricsResponse, _$MetricsResponse];

  @override
  final String wireName = r'MetricsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    MetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MetricsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MetricsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MetricsResponseBuilder();
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

