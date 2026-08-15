//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_log_client_error.g.dart';

/// System error details included in the log sent by the client.
///
/// Properties:
/// * [cause] - Original cause of the error.
/// * [columnNumber] - Column number in the line of the file that raised the error.
/// * [fileName] - Filename where the error happened.
/// * [lineNumber] - Line number where the error happened.
/// * [message] - Human-readable description of the error.
/// * [messageDetail] - More detail about the message.
/// * [name] - Filename where the error happened.
/// * [number] - Integer that specifies the error code.
/// * [stackTrace] - Stack trace of where the error happened.
@BuiltValue()
abstract class IntegrationLogClientError implements Built<IntegrationLogClientError, IntegrationLogClientErrorBuilder> {
  /// Original cause of the error.
  @BuiltValueField(wireName: r'cause')
  String? get cause;

  /// Column number in the line of the file that raised the error.
  @BuiltValueField(wireName: r'column_number')
  int? get columnNumber;

  /// Filename where the error happened.
  @BuiltValueField(wireName: r'file_name')
  String? get fileName;

  /// Line number where the error happened.
  @BuiltValueField(wireName: r'line_number')
  int? get lineNumber;

  /// Human-readable description of the error.
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// More detail about the message.
  @BuiltValueField(wireName: r'message_detail')
  String? get messageDetail;

  /// Filename where the error happened.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Integer that specifies the error code.
  @BuiltValueField(wireName: r'number')
  int? get number;

  /// Stack trace of where the error happened.
  @BuiltValueField(wireName: r'stack_trace')
  String? get stackTrace;

  IntegrationLogClientError._();

  factory IntegrationLogClientError([void updates(IntegrationLogClientErrorBuilder b)]) = _$IntegrationLogClientError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogClientErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogClientError> get serializer => _$IntegrationLogClientErrorSerializer();
}

class _$IntegrationLogClientErrorSerializer implements PrimitiveSerializer<IntegrationLogClientError> {
  @override
  final Iterable<Type> types = const [IntegrationLogClientError, _$IntegrationLogClientError];

  @override
  final String wireName = r'IntegrationLogClientError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogClientError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cause != null) {
      yield r'cause';
      yield serializers.serialize(
        object.cause,
        specifiedType: const FullType(String),
      );
    }
    if (object.columnNumber != null) {
      yield r'column_number';
      yield serializers.serialize(
        object.columnNumber,
        specifiedType: const FullType(int),
      );
    }
    if (object.fileName != null) {
      yield r'file_name';
      yield serializers.serialize(
        object.fileName,
        specifiedType: const FullType(String),
      );
    }
    if (object.lineNumber != null) {
      yield r'line_number';
      yield serializers.serialize(
        object.lineNumber,
        specifiedType: const FullType(int),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.messageDetail != null) {
      yield r'message_detail';
      yield serializers.serialize(
        object.messageDetail,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.number != null) {
      yield r'number';
      yield serializers.serialize(
        object.number,
        specifiedType: const FullType(int),
      );
    }
    if (object.stackTrace != null) {
      yield r'stack_trace';
      yield serializers.serialize(
        object.stackTrace,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLogClientError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogClientErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cause':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.cause = valueDes;
          break;
        case r'column_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.columnNumber = valueDes;
          break;
        case r'file_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.fileName = valueDes;
          break;
        case r'line_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lineNumber = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'message_detail':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.messageDetail = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.number = valueDes;
          break;
        case r'stack_trace':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.stackTrace = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLogClientError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogClientErrorBuilder();
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

