//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_create_report_response.g.dart';

/// CatalogsCreateReportResponse
///
/// Properties:
/// * [token] - Token to be used to get the report
@BuiltValue()
abstract class CatalogsCreateReportResponse implements Built<CatalogsCreateReportResponse, CatalogsCreateReportResponseBuilder> {
  /// Token to be used to get the report
  @BuiltValueField(wireName: r'token')
  String? get token;

  CatalogsCreateReportResponse._();

  factory CatalogsCreateReportResponse([void updates(CatalogsCreateReportResponseBuilder b)]) = _$CatalogsCreateReportResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreateReportResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreateReportResponse> get serializer => _$CatalogsCreateReportResponseSerializer();
}

class _$CatalogsCreateReportResponseSerializer implements PrimitiveSerializer<CatalogsCreateReportResponse> {
  @override
  final Iterable<Type> types = const [CatalogsCreateReportResponse, _$CatalogsCreateReportResponse];

  @override
  final String wireName = r'CatalogsCreateReportResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreateReportResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.token != null) {
      yield r'token';
      yield serializers.serialize(
        object.token,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreateReportResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreateReportResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.token = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreateReportResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreateReportResponseBuilder();
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

