//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'notification_post_request.g.dart';

/// Any valid JSON object
@BuiltValue()
abstract class NotificationPostRequest implements Built<NotificationPostRequest, NotificationPostRequestBuilder> {
  /// One Of [BuiltList<BuiltMap<String, JsonObject>>], [JsonObject]
  OneOf get oneOf;

  NotificationPostRequest._();

  factory NotificationPostRequest([void updates(NotificationPostRequestBuilder b)]) = _$NotificationPostRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NotificationPostRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NotificationPostRequest> get serializer => _$NotificationPostRequestSerializer();
}

class _$NotificationPostRequestSerializer implements PrimitiveSerializer<NotificationPostRequest> {
  @override
  final Iterable<Type> types = const [NotificationPostRequest, _$NotificationPostRequest];

  @override
  final String wireName = r'NotificationPostRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NotificationPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    NotificationPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  NotificationPostRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NotificationPostRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(BuiltList, [FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)])]), FullType(JsonObject), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

