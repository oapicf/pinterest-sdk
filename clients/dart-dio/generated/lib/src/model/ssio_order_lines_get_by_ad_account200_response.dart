//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ssio_order_line.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_order_lines_get_by_ad_account200_response.g.dart';

/// SsioOrderLinesGetByAdAccount200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class SsioOrderLinesGetByAdAccount200Response implements Built<SsioOrderLinesGetByAdAccount200Response, SsioOrderLinesGetByAdAccount200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<SSIOOrderLine> get items;

  SsioOrderLinesGetByAdAccount200Response._();

  factory SsioOrderLinesGetByAdAccount200Response([void updates(SsioOrderLinesGetByAdAccount200ResponseBuilder b)]) = _$SsioOrderLinesGetByAdAccount200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SsioOrderLinesGetByAdAccount200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SsioOrderLinesGetByAdAccount200Response> get serializer => _$SsioOrderLinesGetByAdAccount200ResponseSerializer();
}

class _$SsioOrderLinesGetByAdAccount200ResponseSerializer implements PrimitiveSerializer<SsioOrderLinesGetByAdAccount200Response> {
  @override
  final Iterable<Type> types = const [SsioOrderLinesGetByAdAccount200Response, _$SsioOrderLinesGetByAdAccount200Response];

  @override
  final String wireName = r'SsioOrderLinesGetByAdAccount200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SsioOrderLinesGetByAdAccount200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(SSIOOrderLine)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SsioOrderLinesGetByAdAccount200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SsioOrderLinesGetByAdAccount200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(SSIOOrderLine)]),
          ) as BuiltList<SSIOOrderLine>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SsioOrderLinesGetByAdAccount200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SsioOrderLinesGetByAdAccount200ResponseBuilder();
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

