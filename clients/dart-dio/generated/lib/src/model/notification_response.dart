//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'notification_response.g.dart';

/// NotificationResponse
///
/// Properties:
/// * [success] - Returns true if the notification accepted.
/// * [receivedAt] - Received time. Unix timestamp in seconds.
/// * [errorMsg] - error message when success is false
@BuiltValue()
abstract class NotificationResponse implements Built<NotificationResponse, NotificationResponseBuilder> {
  /// Returns true if the notification accepted.
  @BuiltValueField(wireName: r'success')
  bool? get success;

  /// Received time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'received_at')
  int? get receivedAt;

  /// error message when success is false
  @BuiltValueField(wireName: r'error_msg')
  String? get errorMsg;

  NotificationResponse._();

  factory NotificationResponse([void updates(NotificationResponseBuilder b)]) = _$NotificationResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NotificationResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NotificationResponse> get serializer => _$NotificationResponseSerializer();
}

class _$NotificationResponseSerializer implements PrimitiveSerializer<NotificationResponse> {
  @override
  final Iterable<Type> types = const [NotificationResponse, _$NotificationResponse];

  @override
  final String wireName = r'NotificationResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NotificationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.success != null) {
      yield r'success';
      yield serializers.serialize(
        object.success,
        specifiedType: const FullType(bool),
      );
    }
    if (object.receivedAt != null) {
      yield r'received_at';
      yield serializers.serialize(
        object.receivedAt,
        specifiedType: const FullType(int),
      );
    }
    if (object.errorMsg != null) {
      yield r'error_msg';
      yield serializers.serialize(
        object.errorMsg,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    NotificationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NotificationResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'success':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.success = valueDes;
          break;
        case r'received_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.receivedAt = valueDes;
          break;
        case r'error_msg':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.errorMsg = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  NotificationResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NotificationResponseBuilder();
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

